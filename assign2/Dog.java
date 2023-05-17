/**
 This class represents a dog.
 @author Zohaib Khan 3740572
*/
public class Dog {

   /**
    The name of the dog.
   */
   private String name;

   /**
    The age of the dog (in years).
   */
   private int age;

   /**
    This method constructs a Dog object with the specified
    name and age.
    @param nameIn the name of the dog.
    @param ageIn the age of the dog (in years).
   */
   public Dog (String nameIn, int ageIn) {
      name = nameIn;
      age = ageIn;
   }

   /**
    This method retrieves the name of the dog.
    @return the name of the dog.
   */
   public String getName () {
      return name;
   }

   /**
    This method retrieves the age of the dog.
    @return the age of the dog (in years).
   */
   public int getAgeDogYears () {
      return age;
   }

   /**
    This method computes and returns the dog's age in 
    "person years".
    @return the age of the dog (in person years).
   */
   public int getAgePersonYears () {
      return age * 7;
   }

   /**
    This method is called to change the name of the dog.
    @param nameIn the new name for the dog.
   */
   public void changeName (String nameIn) {
      name = nameIn;
   }

   /**
    This method is called to increase the age of the dog
    by one year.
   */
   public void addYear () {
      age = age + 1;
   }

} //end Dog
