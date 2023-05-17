/**
 This is a driver class for the triangle class. 
 @author Zohaib Khan 3740572
*/

public class TriangleTest {

   public static void main (String[] args) {
      
      // Creating two instances of triangle class.
      Triangle t1 = new Triangle (-0.5, 0.0, 0.5, 0.0, 0.0, Math.sqrt(3)/2);
      Triangle t2 = new Triangle (0.0, 0.0, 8.0, 0.0, 0.0, 8.0);
      
      // Calling both methods on t1.
      if (t1.isEquilateral() == true) {
         System.out.println("The triangle t1 is an equilateral triangle.\n");
      }
      else {
         System.out.println("The triangle t1 is not an equilateral triangle.\n");
      }
      
      if(t1.isRight() == true) {
         System.out.println("The triangle t1 is a right-angle triangle.\n");
      }
      else {
         System.out.println("The triangle t1 is not a right-angle triangle.\n");
      }
      
      // Calling both methods on t2.
      if (t2.isEquilateral() == true) {
         System.out.println("The triangle t2 is an equilateral triangle.\n");
      }
      else {
         System.out.println("The triangle t2 is not an equilateral triangle.\n");
      }
      
      if(t2.isRight() == true) {
         System.out.println("The triangle t2 is a right-angle triangle.\n");
      }
      else {
         System.out.println("The triangle t2 is not a right-angle triangle.\n");
      }
   }
   
}