/**
 This is a driver program for the Box and Tube classes.
 @author Zohaib Khan 3740572.
*/

import java.util.Scanner;
import java.text.NumberFormat;

public class ContainerTest {

   public static void main (String[] args) {
        
      NumberFormat formatter = NumberFormat.getNumberInstance();
      formatter.setMaximumFractionDigits(3);
      formatter.setMinimumFractionDigits(3);
   
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      double largestBVolume = Double.NEGATIVE_INFINITY;
      double largestTVolume = Double.NEGATIVE_INFINITY;
      double smallestBArea = Double.POSITIVE_INFINITY;
      double smallestTArea = Double.POSITIVE_INFINITY;
      
      while (choice != 3) {
	  	  System.out.println("\nWhat would you like to do?"
		                     + "\n1 - Get info for a box"
		                     + "\n2 - Get info for a tube"
		                     + "\n3 - Quit");

		  System.out.print("Enter your choice: ");
	  
		  choice = sc.nextInt();
	  
		  if (choice == 1) {
		     System.out.print("Length (in cm): ");
			 double l = sc.nextDouble();
		 
			 System.out.print("Width (in cm): ");
			 double w = sc.nextDouble();
		 
			 System.out.print("Height (in cm): ");
			 double h = sc.nextDouble();
		 
			 Box box = new Box (l, w, h);
			 
			 System.out.println("The volume is: " 
			 + formatter.format(box.getVolume()) 
			 + " cubic centimeters.");
			 System.out.println("The surface area is: " 
			 + formatter.format(box.getSurfaceArea()) 
			 + " square centimeters.");
			 
			 if (box.getVolume() > largestBVolume) {
			    largestBVolume = box.getVolume();
			 }
			 
			 if (box.getSurfaceArea() < smallestBArea) {
			    smallestBArea = box.getSurfaceArea();
			 }
		  }
	  
		  else if (choice == 2) {
	  
			 System.out.print("Radius (in cm): ");
			 double r = sc.nextDouble();
		 
			 System.out.print("Height (in cm): ");
			 double h = sc.nextDouble();
		 
			 Tube tube = new Tube (r, h);
			 
			 System.out.println("The volume is: " 
			                    + formatter.format(tube.getVolume()) 
			                    + " cubic centimeters.");
			 System.out.println("The surface area is: " 
			                    + formatter.format(tube.getSurfaceArea()) 
			                    + " square centimeters.");                   
						 
			 if (tube.getVolume() > largestTVolume) {
			    largestTVolume = tube.getVolume();
			 }
			 
			 if (tube.getSurfaceArea() < smallestTArea) {
			    smallestTArea = tube.getSurfaceArea();
			 }
         }
         
         else if (choice > 3 || choice < 1) {
            System.out.println("Invalid choice. Please choose from the options provided.");
         }
      }
      
	  if (largestTVolume > largestBVolume) {
		 System.out.println("The container with the largest volume is a tube."
						   + "\nThe volume is: " + formatter.format(largestTVolume)
						   + " cubic centimeters.");
	  }
	  else {
		 System.out.println("The container with the largest volume is a box."
						   + "\nThe volume is: " + formatter.format(largestBVolume)
						   + " cubic centimeters.");
	  }
	 
	  if (smallestBArea < smallestTArea) {
		 System.out.println("The container with the smallest surface area is a box."
						   + "\nThe surface area is: " + formatter.format(smallestBArea)
						   + " square centimeters." );
	  }
	  else {
		 System.out.println("The container with the smallest surface area is a tube."
						   + "\nThe surface area is: " + formatter.format(smallestTArea)
						   + " square centimeters.");
	  }     
   }     
}