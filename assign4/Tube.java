/**
 This class represents a tube.
 @author Zohaib Khan 3740572.
*/

public class Tube {

   /**
    This is the radius r of the tube.
   */
   private double r;
   
   /**
    This is the height h of the tube.
   */
   private double h;
   
   /**
    This is the constructor method to initialize the instance variables.
    @param r the radius of the tube.
    @param h the height of the tube.
   */
   public Tube (double r, double h) {
      this.r = r;
      this.h = h; 
   }

   /**
    This method retrieves the radius r.
    @return r the radius of the tube.
   */
   public double getRadius() {
      return r;
   }
   
   /**
    This method retrieves the height h.
    @return h the height of the tube. 
   */
   public double getHeight() {
      return h;
   }
   
   /**
    This method retrieves the volume of the tube.
    @return the volume of the tube.
   */
   public double getVolume() {
      return Math.PI * r * r * h;
   }
   
   /**
    This method retrieves the surface area of the tube.
    @return the surface area of the tube.
   */
   public double getSurfaceArea() {
      return (2 * Math.PI * r * h) + (2 * Math.PI * r * r);
   }

}