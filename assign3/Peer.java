import java.util.Scanner;

/**
 This is a class for determining people's 
 eligibility to apply for a Peer Mentor Position.
 @author Zohaib Khan 3740572
*/

public class Peer {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please answer the following questions with either a yes or a no.");
      System.out.println("Are you an undergrad student?"); 
      String input1 = sc.nextLine();
            
      if (input1.equals("yes")) {
         System.out.println("Will you be on a study term?");
         String input2 = sc.nextLine(); 
         
         if (input2.equals("yes")) {
            System.out.println("Is you GPA at least 2.7?");
            String input3 = sc.nextLine();
            
            if (input3.equals("yes")) {
               System.out.println("You should apply!");
            }
            else if (input3.equals("no")) {
               System.out.println("Sorry, you cannot apply");
            }
            else {
               System.out.println("Invalid input");
            }
            
         }
         else if (input2.equals("no")) {
            System.out.println("Sorry, you cannot apply");
         }
         else {
            System.out.println("Invalid input");
         }
         
      }
      else if (input1.equals("no")) {
         System.out.println("Are you a grad student?");
         String input2 = sc.nextLine();
         
         if (input2.equals("yes")) {
            System.out.println("Do you have your supervisor's permission?");
            String input3 = sc.nextLine();
            
            if (input3.equals("yes")) {
               System.out.println("You should apply!");
            }
            else if (input3.equals("no")) {
               System.out.println("Sorry, you cannot apply");
            }
            else{
               System.out.println("Invalid input");
            }
            
         }
         else if (input2.equals("no")) {
            System.out.println("Sorry, you cannot apply");
         }
         else{
            System.out.println("Invalid input");
         }
         
      }
      else {
         System.out.println("Invalid input");
      }
   }
}