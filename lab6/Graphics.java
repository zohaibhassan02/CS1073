/**
 This is a GUI application program for an acronym or password generator.
 @author Zohaib Khan - 3740572
*/


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button; 
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Pos; 
import javafx.event.ActionEvent; 


public class Graphics extends Application {
	
	private TextField input;
	private Text result;
	
	public void start (Stage primaryStage) {
		
		primaryStage.setTitle ("String Generator"); 
		
		Text intro = new Text ("Enter a title or phrase:");
		
		input = new TextField();
		input.setPrefWidth(500);
		
		Button acronym = new Button ("Generate Acronym");
		acronym.setOnAction(this::createAcronym);
		
		Button password = new Button ("Generate Password");
		password.setOnAction(this::createPassword);
		
		Button reset = new Button ("Reset");
		reset.setOnAction(this::clearRequest);
		
		result = new Text ("Let's create an acronym or password!");
		
		FlowPane pane = new FlowPane (intro, input,
		                              acronym, password,
									  reset, result);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap (65);
		pane.setVgap (40);
		
		Scene scene = new Scene (pane,540,270 );
		
		primaryStage.setScene (scene);
		
		primaryStage.show (); 
		
	}
	
	public void createAcronym (ActionEvent event){
		String acronymText = 
		   StringGenerator.generateAcronym(input.getText());
		result.setText(acronymText);
	}
	
	public void createPassword (ActionEvent event){
		String passwordText = 
		   StringGenerator.generatePassword(input.getText());
		result.setText(passwordText);
	}
	
	public void clearRequest (ActionEvent event){ 
		input.setText("");
		result.setText("Let's create an acronym or password!");
						 
	}
	
}
	
	
		
		
	
	