/** 
  This is an example of a driver program; its purpose is 
  to "try out" the Candidate class.
  @author Natalie Webber
  @author Zohaib Khan 3740572
*/
public class Election {

   public static void main (String[] args) {

      // Create a few Candidate objects:
      Candidate candidate1 = 
         new Candidate ("Mary Brown", "Conservative Party", "Vote for tomorrow");
      Candidate candidate2 = 
         new Candidate ("Wendy Thomas", "Green Party", "The choice for change");
      Candidate candidate3 = 
         new Candidate ("Ron McDonald", "Liberal Party", "New Vision, New Direction");
      // Creating a new Object:
      Candidate candidate4 = 
         new Candidate ("Tim Bush", "Democratic Party", "The right man with the right experience");

      // Adding votes to candidates:
      candidate1.addVotes(160);
      candidate2.addVotes(209);
      candidate3.addVotes(271);
      candidate2.addVotes(113);
 
      // Now I can print out my candidates:
      System.out.println ("Candidate 1:\n" + candidate1.toString());
      System.out.println ("Candidate 2:\n" + candidate2.toString());
      System.out.println ("Candidate 3:\n" + candidate3.toString());
      System.out.println ("Candidate 4:\n" + candidate4.toString());

   } 
   
} // end of Election class
