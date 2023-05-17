/**
 This is a GUI application program for an anagram tester.
 @author Zohaib Khan 3740572
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
import java.util.Scanner;


public class Anagram extends Application {
	
	private TextField word1, word2;
	private Text result;
	
	public void start (Stage primaryStage) {
		
		primaryStage.setTitle ("String Generator"); 
		
		Text introText = new Text ("Enter a title or phrase:");
		
		wordTextField1 = new TextField();
		wordTextField1.setPrefWidth(500);
		
		wordTextField2 = new TextField();
		wordTextField2.setPrefWidth(500);
		
		Button anagram = new Button ("Are these anagrams?");
		anagram.setOnAction(this::anagramProcess);

		
		result = new Text ("Let's test some possible anagrams!");
		
		FlowPane pane = new FlowPane (introText, wordTextField1,
		                              wordTextField2, anagram,
									  result);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(65);
		pane.setVgap(40);
		
		Scene scene = new Scene (pane, 540, 270);
		
		primaryStage.setScene(scene);
		
		primaryStage.show(); 
		
	}
	
	public void anagramProcess (ActionEvent event){
	    
            word1 = wordTextField1.toLowerCase();
            word2 = wordTextField2.toLowerCase();
            int counter = 0;


			char[] array1 = word1.toCharArray();
			char[] array2 = word2.toCharArray();
				
			int counter = 0;
		
			if (word1.length() == word2.length()){

				for(int i=0; i<word1.length(); i++){
					boolean isAnagram = false;
				
					for(int j=0; j<word2.length() && !(isAnagram); j++){
					
						if (array1[i] == array2[j]){
							counter++;
							isAnagram = true;
							array2[j] = (char) 0;
						
						}
					
					}

				}
			
			}
			if (counter == word1.length()){
				result.setText(word2 + " is an anagram of " + word1);
			}
			else {
				result.setText(word2 + " is NOT an anagram of " + word1);
			}
            
            
            
//            ANOTHER WAY WITHOUT USING ARRAYS:
//             word1 = word1.toLowerCase();
//             word2 = word2.toLowerCase();
//             int counter = 0;
//             if (word1.length() == word2.length()){
//             
//                 for (int i=0; i<word1.length(); i++){
//                 
//                     boolean isAnagram = false;
//                     
//                     for (int j=0; j<word2.length() && !(isAnagram); j++){
//                         if(word1.charAt(i) == word2.charAt(j)){
//                             counter++;
//                             isAnagram = true;
//                             word2 = word2.substring(0, j) + word2.substring(j+1);
//                         }
//                     }
//                 }
//             }
//             
//             if(counter == word1.length()){
//                 result.setText(word2 + "is an anagram of " + word1);
//             }
//             else{
//                 result.setText(word2 + " is NOT an anagram of " + word1);
//             }          
      

	}
	
}
	
	
		
		
	
	