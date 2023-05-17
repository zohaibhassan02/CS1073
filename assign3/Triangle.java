/**
 This class represents a triangle shape using 3 points.
 @author Natalie Webber
 @author Zohaib Khan 3740572
*/
public class Triangle {

   private CartesianPoint pointA;
   private CartesianPoint pointB;
   private CartesianPoint pointC;
  
   public Triangle (double x1, double y1,
                    double x2, double y2,
                    double x3, double y3) {
      pointA = new CartesianPoint (x1, y1);
      pointB = new CartesianPoint (x2, y2);
      pointC = new CartesianPoint (x3, y3);
   }
  
   public Triangle (CartesianPoint p1,
                    CartesianPoint p2,
                    CartesianPoint p3) {
      pointA = p1;
      pointB = p2;
      pointC = p3;
   }
  
   public double getPerimeter () {
      return pointA.distance(pointB)
           + pointB.distance(pointC)
           + pointC.distance(pointA);
   }
   
   /**
    This method tells if the triangle is equilateral triangle or not.
    @return true if the triangle is an equilateral triangle, false otherwise.
   */
   public boolean isEquilateral () {
   
      double ab = pointA.distance(pointB);
      double bc = pointB.distance(pointC);
      double ac = pointA.distance(pointC);
      
      // Setting the tolerance to compare floating point numbers for equality.
      double TOLERANCE = 1E-13;
   
      if ((Math.abs(ab-ac) < TOLERANCE) && 
          (Math.abs(ab-bc) < TOLERANCE)) {
         return true;
      }
      else {
         return false;
      }
   
   }
   
   /**
    This method tells if the triangle is a right-angle triangle or not.
    @return true if the triangle is a right-angle triangle, false otherwise.
   */
   
   public boolean isRight () {
      
      double ab = pointA.distance(pointB);
      double bc = pointB.distance(pointC);
      double ac = pointA.distance(pointC);
      
      // Setting the tolerance to compare floating point numbers for equality.
      double TOLERANCE = 1E-13;
   
      if ((Math.abs(ab*ab + ac*ac - bc*bc) < TOLERANCE) || 
                   
          (Math.abs(ab*ab + bc*bc - ac*ac) < TOLERANCE) || 
                   
          (Math.abs(ac*ac + bc*bc - ab*ab) < TOLERANCE)) {
                    
         return true;
      }
      else {
         return false;
      }
   
   }
   
}
