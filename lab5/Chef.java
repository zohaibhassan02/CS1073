/**
 This subclass represents a chef at a restaurant.
 @author Zohaib Khan 3740572
*/

public class Chef extends RestaurantWorker {

   /**
    This is the amount of union fees that is to be deducted from their pay each week.
   */
   private double unionFees;

   /**
    This is the constructor method to initialize all instance variables.
    @param name the name of the worker.
    @param jobTitle the job title of the worker.
    @param hourlyRate the hourly rate of the worker.
    @param unionFees the weekly union fees of this worker.
   */
   public Chef (String name, String jobTitle, double hourlyRate, double unionFees){
      super(name, jobTitle, hourlyRate);
      this.unionFees = unionFees;
   }

   /**
    This method computes and returns the total pay that this person earns this week.
    @param hours the number of hours the worker has worked this week.
    @return the total pay this person earns this week.
   */
   public double computePay (double hours) {
      if (hours > 40) {
         return super.computePay(40) + super.computePay((hours-40)*1.5) - unionFees;
      }
      else {
         return super.computePay(hours) - unionFees;
      }
   }
}
