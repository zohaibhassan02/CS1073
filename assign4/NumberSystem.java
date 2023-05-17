/**
 This is a class for a number conversion system from Arabic to Mayan.
 @author Zohaib Khan 3740572.
*/

import java.util.Scanner;

public class NumberSystem {
   public static void main (String[] args){

      Scanner sc = new Scanner (System.in);

      System.out.print("Enter an arabic number: ");
      int userInput = sc.nextInt();
      String str = "";
      int remainder = 0;
      int quotient = 0;
      String final_str = "";
      
      while (userInput < 0) {
         System.out.println("Invalid input. You must enter a non-negative number.");
         System.out.print("Please enter another Arabic number now: ");
         userInput = sc.nextInt();
      }
      
      int originalInput = userInput;

      while (userInput > 0) {
         remainder = userInput%20;
         quotient = (userInput - remainder ) / 20;

         while (remainder > 5) {
            str += "_ ";
            remainder = remainder - 5;
         }

         if (remainder == 0) {
            str += "U";
         }

         else if (remainder == 1) {
            str += "O";
         }
         else if (remainder == 2) {
            str += "O O"; 
         }
         else if (remainder == 3) {
            str += "O O O";
         }
         else if (remainder == 4) {
            str += "O O O O";
         }
         else if (remainder == 5) {
            str += "_ ";
         }

         userInput = quotient;
         final_str = str+"\n"+final_str;
         str = "";
         
         }

      System.out.print("The Mayan output for " 
                       + originalInput + " is: \n"
                       + final_str);
   }

}



