//Imports that I’ll need...
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
import java.text.NumberFormat;
//Continued on the next slide...

public class Booking extends Application {
   private TextField letterField;
   private TextField letterField2;
   private TextField letterField3;

   private Text buildingResult;
   private Text priceResult;

   public void start (Stage primaryStage) {
      primaryStage.setTitle ("Package Calculator");

      Label fieldLabel = new Label ("Guest Name:");
      Label fieldLabel2 = new Label ("Number of à la Carte Meals:");
      Label fieldLabel3 = new Label ("Number of Spa Visits:");

      letterField = new TextField ();
      letterField2 = new TextField ();
      letterField3 = new TextField ();

      letterField.setPrefWidth (130);
      letterField2.setPrefWidth (50);
      letterField3.setPrefWidth (50);

      letterField.setOnAction(this::touristRequest);
      letterField2.setOnAction(this::touristRequest);
      letterField3.setOnAction(this::touristRequest);

      letterField.setOnAction(this::eliteRequest);
      letterField2.setOnAction(this::eliteRequest);
      letterField3.setOnAction(this::eliteRequest);

      Button touristButton = new Button ("Tourist");
      Button eliteButton = new Button ("Elite");
      Button resetButton = new Button ("Reset");


      touristButton.setOnAction (this::touristRequest);
      eliteButton.setOnAction (this::eliteRequest);
      resetButton.setOnAction (this::resetRequest);

      buildingResult =
      new Text ("Welcome to Paradise Palms!");

      priceResult = 
      new Text ("Enter your booking information");

//start method continued on the next slide...

     FlowPane pane = new FlowPane
     (fieldLabel, letterField, fieldLabel2, letterField2, fieldLabel3, letterField3,               touristButton, eliteButton, resetButton, buildingResult, priceResult);
     pane.setAlignment(Pos.CENTER);

     pane.setHgap (10);
     pane.setVgap (20);
     Scene scene = new Scene (pane, 270, 300);
     primaryStage.setScene (scene);
     primaryStage.show ();

   } //end start method

   public void touristRequest (ActionEvent event) {
      String name = letterField.getText();
      int meals = Integer.parseInt(letterField2.getText());
      int spas = Integer.parseInt(letterField3.getText());

      NumberFormat formatter = NumberFormat.getCurrencyInstance();
// formatter.setMaximumFractionDigits(1);
// formatter.setMinimumFractionDigits(1);

      TouristPackageBooking tourist = new TouristPackageBooking (name, meals, spas);

      buildingResult.setText("Building Number: " + tourist.getBuilding());
   
 


      priceResult.setText("Total price for this package: " + formatter.format(tourist.getCost()));
   }


   public void eliteRequest (ActionEvent event) {
      String name = letterField.getText();
      int meals = Integer.parseInt(letterField2.getText());
      int spas = Integer.parseInt(letterField3.getText());

      NumberFormat formatter = NumberFormat.getCurrencyInstance();
// formatter.setMaximumFractionDigits(1);
// formatter.setMinimumFractionDigits(1);

      ElitePackageBooking elite = new ElitePackageBooking (name, meals, spas);

      buildingResult.setText("Building Number: " + elite.getBuilding());
   
 
      priceResult.setText("Total price for this package: " + formatter.format(elite.getCost()));

   }


   public void resetRequest (ActionEvent event) {
      buildingResult.setText ("Welcome to Paradise Palms!");
      letterField.setText("");
      letterField2.setText("");
      letterField3.setText("");
      priceResult.setText("Enter your booking information");
   }

} //end class

