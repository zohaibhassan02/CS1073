/**
 This is a driver program for the FunZoneBadge class.
 @author Zohaib Khan 3740572
*/

public class FunZoneDriver {

   public static void main (String[] args){
   
      // Creating a badge object for Ben.
      FunZoneBadge bensBadge = new FunZoneBadge ("Ben Landry", 12341234);
   
      // Charging Ben for laser tag.
      bensBadge.addAmount(6.00);
   
      // Creating a badge object for Maria.
      FunZoneBadge mariasBadge = new FunZoneBadge ("Maria Lopez", 2468135);
   
      // Charging Maria for trampoline park.
      mariasBadge.addAmount(7.25);
   
      // Creating a badge object for Karl.
      FunZoneBadge karlsBadge = new FunZoneBadge ("Karl Wagner", 3451016);
   
      // Charging Karl for Mandalorian pinball.
      karlsBadge.addAmount(2.75);
   
      // Creating a badge object for Lori.
      FunZoneBadge lorisBadge = new FunZoneBadge ("Lori Evans", 5798642);
   
      // Charging Lori for wall climbing.
      lorisBadge.addAmount(12.50);
   
      // Charging Lori for axe throwing.
      lorisBadge.addAmount(18.75);
   
      // Charging Maria for sundae bar.
      mariasBadge.addAmount(6.50);
   
      // Charging Ben and Karl for pool.
      bensBadge.addAmount(9.50);
      karlsBadge.addAmount(9.50);
   
   
      // Printing out each badge holder.
      System.out.println ("Badge holder 1:\n" 
      + "Name: " + bensBadge.getName() 
      + "\nBadge number: " + bensBadge.getBadgeNumber() 
      + "\nTotal charges: " + bensBadge.getTotal()
      + "\nAmount donated: " + bensBadge.getDonation(0.18)
      + "\n");
   
      System.out.println ("Badge holder 2:\n" 
      + "Name: " + mariasBadge.getName() 
      + "\nBadge number: " + mariasBadge.getBadgeNumber() 
      + "\nTotal charges: " + mariasBadge.getTotal() 
      + "\nAmount donated: " + mariasBadge.getDonation(0.12)
      + "\n");
   
      System.out.println ("Badge holder 3:\n" 
      + "Name: " + karlsBadge.getName() 
      + "\nBadge number: " + karlsBadge.getBadgeNumber() 
      + "\nTotal charges: " + karlsBadge.getTotal()
      + "\nAmount donated: " + karlsBadge.getDonation(0.20) 
      + "\n");
   
      System.out.println ("Badge holder 4:\n" 
      + "Name: " + lorisBadge.getName() 
      + "\nBadge number: " + lorisBadge.getBadgeNumber() 
      + "\nTotal charges: " + lorisBadge.getTotal() 
      + "\nAmount donated: " + lorisBadge.getDonation(0.20)
      + "\n");
   
   }
   
} //end class