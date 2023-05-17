/**
 This parent class represents someone who works at a restaurant.
 @author Zohaib Khan 3740572
*/

public class RestaurantWorker {

   /**
    This is the name of the worker.
   */
   private String name;

   /**
    This is the job title of the worker.
   */
   private String jobTitle;

   /**
    This is the hourly rate of the worker.
   */
   private double hourlyRate;
   
   /**
    This is the constructor method to initialize all instance variables.
    @param name the name of the worker.
    @param jobTitle the job title of the worker.
    @param hourlyRate the hourly rate of the worker.
   */
   public RestaurantWorker (String name, String jobTitle, double hourlyRate){
      this.name = name;
      this.jobTitle = jobTitle;
      this.hourlyRate = hourlyRate;
   }

   /**
    This method returns the name of the worker.
    @return name the name of the worker.
   */
   public String getName () {
      return name;
   }

   /**
    This method returns the job title of the worker.
    @return jobTitle the job title of the worker.
   */
   public String getJobTitle () {
      return jobTitle;
   }
   
   /**
    This method returns the hourly rate of the worker.
    @return hourlyRate the hourly rate of the worker.
   */
   public double getHourlyRate () {
      return hourlyRate;
   }

   /**
    This method computes and returns the total pay that this worker earns this week.
    @param hours the number of hours the worker has worked this week.
    @return the total pay this worker earns this week.
   */
   public double computePay (double hours) {
      return hourlyRate * hours;
   }

}
