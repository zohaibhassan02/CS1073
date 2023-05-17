/**
 This class generates a sleep tracking report.
 @author Zohaib Khan 3740572
*/

import java.util.Scanner;

public class SleepTracker {
   
   public static void main (String[] args) {
   
      int numNights = 0;
      double idealTime = 0.00;
      int belowIdealTime = 0;
      double min = 10000.00;
      double avg = 0.00;
      double total = 0.00;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter your optimal sleep time (in hours):");
      
      idealTime = sc.nextDouble();
      while (idealTime < 0) {
         System.out.println("Optimal sleep time must be non-negative.");
         System.out.println("Please enter your optimal sleep time (in hours):");
         idealTime = sc.nextDouble();
      }
      
      System.out.println("Next, enter your recorded sleep history values (in hours).");
      System.out.println("Enter a negative number when done:");
      
      double sleepRecord = sc.nextDouble();
      while (sleepRecord >= 0) {
         numNights = numNights + 1;
         total = total + sleepRecord;
         if (sleepRecord < min) {
            min = sleepRecord;
         }
         if (sleepRecord < idealTime) {
            belowIdealTime = belowIdealTime + 1;
         }
         
         sleepRecord = sc.nextDouble();
      
      }
      
      avg = total / numNights;
      
      System.out.println("Your sleep report:\n"
                        + numNights + " nights total\n"
                        + belowIdealTime + " nights below your optimal sleep time\n"
                        + "Lowest sleep time: " + min + "\n"
                        + "Average sleep time: " + avg);
   }
}