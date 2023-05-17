/**
 This class is used to determine a student's scholarship eligibility.
 @author Zohaib Khan 3740572
*/

import java.util.Scanner;

public class ScholarshipAssessment {
   public static void main (String[] args) {
    	
      Scanner sc = new Scanner(System.in);
      int scholarship = 500;

      System.out.println("Enter the number of credit hours completed in the last year:");
      int credits = sc.nextInt();

      while (credits < 0) {
          	 			    
         System.out.println("Credit hours must be non-negative.");
         System.out.println("Enter the number of credit hours completed in the last year:");

         credits = sc.nextInt(); 	
      }

      if (credits < 24) {
         System.out.println("Have you participated in a university co-op program in the last year (yes or no)?");
         String coop = sc.next();
         
         while (!coop.equals("yes") && !coop.equals("no")) {
 	 			    
            System.out.println("Enter yes or no:");
            
            coop = sc.next();
         }
     
         if (coop.equals("yes")) {
            System.out.println("Enter your GPA:");
			double gpa = sc.nextDouble();

            while (gpa < 0) {
               System.out.println("Invalid GPA. Enter a non-negative GPA:");
               gpa = sc.nextDouble();  
            }
            
            if (gpa >= 2.7) {
            
               if (gpa >= 3 && gpa < 3.7) {
                  scholarship = scholarship + 200;
               }
               
               if (gpa >= 3.7) {
                  scholarship = scholarship + 400;
               }
            
               System.out.println("Enter the number of official university clubs, societies, or teams in which you participated last year:");

               int clubs = sc.nextInt();
            
               while (clubs < 0) {
                  System.out.println("Invalid number. Enter a non-negative number");
                  clubs = sc.nextInt();
               }
            
               if (clubs >= 3) {
                  scholarship = scholarship + 100;
               } 

               System.out.println("Do you have demonstrated financial need (yes or no)?");
               String need = sc.next();
           
               while (!need.equals("yes") && !need.equals("no")) {
 	 			    
                  System.out.println("Enter yes or no:");
                  need = sc.next();
               }
               if (need.equals("yes")) {
                   scholarship = scholarship * 2;
               }

               System.out.println("You are eligible for a scholarship of $" + scholarship);
         
            }
            else {
               System.out.println("Sorry, you are not eligible for a scholarship.");
            }
         }
 
         else {
            System.out.println("Sorry, you are not eligible for a scholarship.");
         }
      }
      else {
         
         System.out.println("Enter your GPA:");
		 double gpa = sc.nextDouble();

         while (gpa < 0) {
            System.out.println("Invalid GPA. Enter a non-negative GPA:");
            gpa = sc.nextDouble();  
         }
            
         if (gpa >= 2.7) {
            
            if (gpa >= 3 && gpa < 3.7) {
               scholarship = scholarship + 200;
            }
               
            if (gpa >= 3.7) {
               scholarship = scholarship + 400;
            }
            
            System.out.println("Enter the number of official university clubs, societies, or teams in which you participated last year:");

            int clubs = sc.nextInt();
            
            while (clubs < 0) {
               System.out.println("Invalid number. Enter a non-negative number");
               clubs = sc.nextInt();
            }
            
            if (clubs >= 3) {
               scholarship = scholarship + 100;
            } 

            System.out.println("Do you have demonstrated financial need (yes or no)?");
            String need = sc.next();
           
            while (!need.equals("yes") && !need.equals("no")) {    
               System.out.println("Enter yes or no:");
               need = sc.next();
            }
            if (need.equals("yes")) {
               scholarship = scholarship * 2;
            }

            System.out.println("You are eligible for a scholarship of $" + scholarship);
         
         }   
         else {
            System.out.println("Sorry, you are not eligible for a scholarship.");
         }
         
      } 
   }
}

