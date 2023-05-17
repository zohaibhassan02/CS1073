/**
 This subclass represents a server at this restaurant.
 @author Zohaib Khan 3740572
*/

public class Server extends RestaurantWorker {

   /**
    This is the footware allowance amount that this person earns (per hour).
   */
   private double allowance;

   /**
    This is the constructor method to initialize all instance variables.
    @param name the name of the worker.
    @param jobTitle the job title of the worker.
    @param hourlyRate the hourly rate of the worker.
    @param allowance the hourly footware allowance of this worker.
   */
   public Server (String name, String jobTitle, double hourlyRate, double allowance){
      super(name, jobTitle, hourlyRate);
      this.allowance = allowance;
   }

   /**
    This method computes and returns the total pay that this person earns this week.
    @param hours the number of hours the worker has worked this week.
    @return the total pay this person earns this week.
   */
   public double computePay (double hours) {
      return (allowance * (int)hours) + super.computePay(hours);
   }

}
