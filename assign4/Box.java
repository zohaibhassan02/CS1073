/**
 This class represents a box.
 @author Zohaib Khan 3740572.
*/

public class Box {

   /**
    This is the length l of the box.
   */
   private double l;
   
   /**
    This is the width w of the box.
   */
   private double w;
   
   /**
    This is the height h of the box.
   */
   private double h;
   
   /**
    This is the constructor method to initialize the instance variables.
    @param l the length of the box.
    @param w the width of the box.
    @param h the height of the box.
   */
   public Box (double l, double w, double h) {
      this.l = l;
      this.w = w;
      this.h = h; 
   }

   /**
    This method retrieves the length of the box.
    @return l the length of the box.
   */
   public double getLength() {
      return l;
   }
   
   /**
    This method retrieves the width of the box.
    @return w the width of the box.
   */
   public double getWidth() {
      return w;
   }
   
   /**
    This method retrieves the height of the box.
    @return h the height of the box.
   */
   public double getHeight() {
      return h;
   }
   
   /**
    This method retrieves the volume of the box.
    @return the volume of the box.
   */
   public double getVolume() {
      return l * w * h;
   }
   
   /**
    This method retrieves the surface area of the box.
    @return the surface area of the box.
   */
   public double getSurfaceArea() {
      return (2 * l * w) + (2 * l * h) + (2 * w * h);
   }

}