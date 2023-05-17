/**
 This is a driver program for the dog class.
 @author Zohaib Khan 3740572
*/

public class DogTestDriver {

   public static void main (String[] args){
   
      // Creating 3 dog objects.
      Dog dog1 = new Dog ("Tom", 3);
      Dog dog2 = new Dog ("Duke", 5);
      Dog dog3 = new Dog ("Max", 8);
   
      // Changing the name of dog3.
      dog3.changeName ("Milo");
   
      // Adding a year to dog2's age.
      dog2.addYear();
   
      // Printing out each dog.
      System.out.println ("Dog 1:\n" 
      + "Name: " + dog1.getName() 
      + "\nAge in dog years: " + dog1.getAgeDogYears() 
      + "\nAge in person years: " + dog1.getAgePersonYears() 
      + "\n");
   
      System.out.println ("Dog 2:\n" 
      + "Name: " + dog2.getName() 
      + "\nAge in dog years: " + dog2.getAgeDogYears() 
      + "\nAge in person years: " + dog2.getAgePersonYears() 
      + "\n");
   
      System.out.println ("Dog 3:\n" 
      + "Name: " + dog3.getName() 
      + "\nAge in dog years: " + dog3.getAgeDogYears() 
      + "\nAge in person years: " + dog3.getAgePersonYears() 
      + "\n");
   
   }
   
}  //end class