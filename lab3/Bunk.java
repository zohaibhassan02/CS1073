/** 
 Class representing a bed at a sleep-away camp 
 for children and teens.
 @author Zohaib Khan 3740572
*/

public class Bunk {

   /**
    Name of the building.
   */
   private String name;

   /**
    The bed number.
   */
   private int num;

   /**
    Cost of the bunk per week.
   */
   private double cost;

   /**
    Constructor method to initiatize the instance variables.
    @param nameIn the name of the building.
    @param numIn the bed number.
    @param costIn the cost of the bunk per week.
   */
   public Bunk (String nameIn, int numIn, double costIn) {
      name = nameIn;
      num = numIn;
      cost = costIn;
   }

   /**
    Gets the name of the building.
    @return the name of the building.
   */
   public String getName () {
      return name;
   }

   /**
    Gets the bed number.
    @return the bed number.
   */
   public int getNum () {
      return num;
   }
   
   /**
    Gets the cost of the bunk per week.
    @return the cost of the bunk per week.
   */
   public double getCost () {
      return cost;
   }

} //end class
