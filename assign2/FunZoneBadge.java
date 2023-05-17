/**
 This class represents a FunZoneBadge.
 @author Zohaib Khan 3740572
*/

public class FunZoneBadge {

   /**
    The name of the badge holder.
   */
   private String name;
   
   /**
    The badge number.
   */ 
   private int badgeNumber;
   
   /**
    The total amount of charges that
    have been added to the badge.
    */
    private double totalAmountOwed;

   /** 
    Constructor class to initialize the
    instance variables.
    @param nameIn the name of the badge holder.
    @param badgeNumberIn the badge number.
   */
   public FunZoneBadge (String nameIn, int badgeNumberIn) {
      name = nameIn;
      badgeNumber = badgeNumberIn;
      totalAmountOwed = 0.00; // It will be zero upon entry.
   } 

   /**
    This method retrieves the name of the badge holder.
    @return the name of the badge holder.
   */
   public String getName () {
      return name;
   }

   /**
    This method retrieves the badge number.
    @return the badge number.
   */
   public int getBadgeNumber () {
      return badgeNumber;
   }
   
   /**
    This method returns the total amount owed.
    @return the total amount owed.
   */
   public double getTotal () {
      return totalAmountOwed;
   }
   
   /**
    Adding the price of the centre's offering.
    @param priceIn the price of accessing an offering.
   */
   public void addAmount (double priceIn) {
      totalAmountOwed = totalAmountOwed + priceIn;
   }

   /**
    Calculating and returning the amount to be donated.
    @param percent the percentage to be donated.
    @return the donation amount.
   */
   public double getDonation (double percent) {
      return totalAmountOwed * percent ;
   }

} //end class