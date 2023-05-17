/**
 This driver class is used to run the RestaurantWorker, Server and Chef classes.
 @author Zohaib Khan 3740572
*/

import java.text.NumberFormat;

public class Payroll {

   public static void main (String[] args) {
   
      NumberFormat formatter = NumberFormat.getCurrencyInstance();

      RestaurantWorker rw1 = new RestaurantWorker ("Jeffery Kingston", "Busser", 13.75);

      RestaurantWorker rw2 = new RestaurantWorker ("Fiona Grant-Long", "Busser", 13.95);

      RestaurantWorker rw3 = new RestaurantWorker ("Roger Haines", "Dishwasher", 14.50);

      Server s1 = new Server ("Jonathan Gorman", "Server", 14.50, 0.12);

      Server s2 = new Server ("Tanya Masterson", "Server", 13.75, 0.10);

      Server s3 = new Server ("Brittany Phillips", "Server", 15.50, 0.15);

      Chef c1 = new Chef ("Laura Cox", "Executive Chef", 26.50, 67.00);

      Chef c2 = new Chef ("Thomas McLean", "Sous Chef", 21.50, 43.50);

      Chef c3 = new Chef ("Nathaniel Paul", "Sous Chef", 22.75, 43.50);

      Chef c4 = new Chef ("Eleanor Ryan", "Pastry Chef", 20.00, 39.00);


      System.out.println("Worker's Name & Job Title \t" + 
                         "Rate of Pay \t" + "Pay this week");
                         
      System.out.println("========================= \t" +
                         "=========== \t" + "=============");

      System.out.println(rw1.getName() + " ("
                         + rw1.getJobTitle() + ")\t"
                         + formatter.format(rw1.getHourlyRate()) + " /hr\t"
                         + formatter.format(rw1.computePay(18)));

      System.out.println(rw2.getName() + " ("
                         + rw2.getJobTitle() + ")\t"
                         + formatter.format(rw2.getHourlyRate()) + " /hr\t"
                         + formatter.format(rw2.computePay(14.5)));

      System.out.println(rw3.getName() + " ("
                         + rw3.getJobTitle() + ")\t"
                         + formatter.format(rw3.getHourlyRate()) + " /hr\t"
                         + formatter.format(rw3.computePay(42)));

      System.out.println(s1.getName() + " ("
                         + s1.getJobTitle() + ")\t"
                         + formatter.format(s1.getHourlyRate()) + " /hr\t"
                         + formatter.format(s1.computePay(46.5)));

      System.out.println(s2.getName() + " ("
                         + s2.getJobTitle() + ")\t"
                         + formatter.format(s2.getHourlyRate()) + " /hr\t"
                         + formatter.format(s2.computePay(18)));

      System.out.println(s3.getName() + " ("
                         + s3.getJobTitle() + ")\t"
                         + formatter.format(s3.getHourlyRate()) + " /hr\t"
                         + formatter.format(s3.computePay(38.5)));

      System.out.println(c1.getName() + " ("
                         + c1.getJobTitle() + ")\t"
                         + formatter.format(c1.getHourlyRate()) + " /hr\t"
                         + formatter.format(c1.computePay(46.5)));

      System.out.println(c2.getName() + " ("
                         + c2.getJobTitle() + ")\t"
                         + formatter.format(c2.getHourlyRate()) + " /hr\t"
                         + formatter.format(c2.computePay(18)));

      System.out.println(c3.getName() + " ("
                         + c3.getJobTitle() + ")\t"
                         + formatter.format(c3.getHourlyRate()) + " /hr\t"
                         + formatter.format(c3.computePay(26)));

      System.out.println(c4.getName() + " (" 
                         + c4.getJobTitle() + ")\t" 
                         + formatter.format(c4.getHourlyRate()) + " /hr\t"
                         + formatter.format(c4.computePay(42)));

   }

}
