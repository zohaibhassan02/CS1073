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

public class Graphics extends Application {
private TextField letterField;
private TextField letterField2;
private Text pointsResult;
private Text gpaResult;
private double totalPoints = 0;
private int totalCreditHours = 0;
private double points = 0;
private double gpa = 0;
public void start (Stage primaryStage) {
primaryStage.setTitle ("My GPA Calculator");
Label fieldLabel = new Label ("Course letter grade:");
Label fieldLabel2 = new Label ("Course credit hours:");

letterField = new TextField ();
letterField2 = new TextField ();

letterField.setPrefWidth (50);
letterField2.setPrefWidth (50);

letterField.setOnAction(this::addRequest);
letterField2.setOnAction(this::addRequest);

Button addButton = new Button ("Add to GPA");
Button clearButton = new Button ("Clear GPA");

addButton.setOnAction (this::addRequest);
clearButton.setOnAction (this::clearRequest);

pointsResult =
new Text ("Welcome to my GPA calculator!");

gpaResult = 
new Text ("Enter your 1st grade & credit hrs.");

//start method continued on the next slide...

FlowPane pane = new FlowPane
(fieldLabel, letterField, fieldLabel2, letterField2, addButton, clearButton, pointsResult, gpaResult);
pane.setAlignment(Pos.CENTER);
pane.setStyle("-fx-background-color:palevioletred");
pane.setHgap (10);
pane.setVgap (20);
Scene scene = new Scene (pane, 250, 300);
primaryStage.setScene (scene);
primaryStage.show ();

} //end start method
public void addRequest (ActionEvent event) {
String grade = letterField.getText();
int creditHours = Integer.parseInt(letterField2.getText());
NumberFormat formatter = NumberFormat.getNumberInstance();
formatter.setMaximumFractionDigits(1);
formatter.setMinimumFractionDigits(1);

switch (grade) {
   case "A+": points = 4.3*creditHours;
              pointsResult.setText ("Points for this course: " + formatter.format(points));
              totalPoints += points;
              totalCreditHours += creditHours;
          //    gpa = totalPoints/totalCreditHours;
         //     totalgpa += gpa;
              break;

   case "A": points = 4.0*creditHours;
             totalPoints += points;
             pointsResult.setText ("Points for this course: " + formatter.format(points));
             totalCreditHours += creditHours;
          //   gpa = totalPoints/totalCreditHours;
          //   totalgpa += gpa;
             break;

   case "A-": points = 3.7*creditHours;
              totalPoints += points;
              pointsResult.setText ("Points for this course: " + formatter.format(points));
              totalCreditHours += creditHours;
           //   gpa = totalPoints/totalCreditHours;
          //    totalgpa += gpa;
              break;

   case "B+": points = 3.3*creditHours;
              totalPoints += points;
              pointsResult.setText ("Points for this course: " + formatter.format(points));
              totalCreditHours += creditHours;
           //   gpa = totalPoints/totalCreditHours;
          //    totalgpa += gpa;
              break;

   case "B": points = 3.0*creditHours;
             totalPoints += points;
             pointsResult.setText ("Points for this course: " + formatter.format(points));
             totalCreditHours += creditHours;
          //   gpa = totalPoints/totalCreditHours;
         //    totalgpa += gpa;
             break;

   case "B-": points = 2.7*creditHours;
              totalPoints += points;
              pointsResult.setText ("Points for this course: " + formatter.format(points));
              totalCreditHours += creditHours;
            //  gpa = totalPoints/totalCreditHours;
           //   totalgpa += gpa;
              break;

   case "C+": points = 2.3*creditHours;
              totalPoints += points;
              pointsResult.setText ("Points for this course: " + formatter.format(points));
              totalCreditHours += creditHours;
            //  gpa = totalPoints/totalCreditHours;
           //   totalgpa += gpa;
              break;

   case "C": points = 2.0*creditHours;
             totalPoints += points;
             pointsResult.setText ("Points for this course: " + formatter.format(points));
             totalCreditHours += creditHours;
           //  gpa = totalPoints/totalCreditHours;
           //  totalgpa += gpa;
             break;

   case "D": points = 1.0*creditHours;
             totalPoints += points;
             pointsResult.setText ("Points for this course: " + formatter.format(points));
             totalCreditHours += creditHours;
          //   gpa = totalPoints/totalCreditHours;
            // totalgpa += gpa;
             break;

   case "F": points = 0.0*creditHours;
             totalPoints += points;
             pointsResult.setText ("Points for this course: " + formatter.format(points));
             totalCreditHours += creditHours;
           //  gpa = totalPoints/totalCreditHours;
         //    totalgpa += gpa;
             break;

   case "WF": points = 0.0*creditHours;
              totalPoints += points;
              pointsResult.setText ("Points for this course: " + formatter.format(points));
              totalCreditHours += creditHours;
            //  gpa = totalPoints/totalCreditHours;
            //  totalgpa += gpa;
              break;

   default: pointsResult.setText ("Invalid grade - GPA not changed.");

   
 
}

gpaResult.setText("Your Cumulative GPA is: " + formatter.format(totalPoints/totalCreditHours));
}

public void clearRequest (ActionEvent event) {
   pointsResult.setText ("Total points are reset");
   letterField.setText("");
   letterField2.setText("");
   gpaResult.setText("Enter your 1st grade & credit hrs.");
   totalPoints = 0;
   totalCreditHours = 0;
}

} //end class


