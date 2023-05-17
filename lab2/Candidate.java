/** 
This class represents a candidate in an election.
@author Natalie Webber
@author Zohaib Khan 3740572
*/
public class Candidate {

   // Instance variables:
   // For each Candidate object, store their name,  
   // the number of votes they has received so far,
   // and their political party.
   private String name;
   private int numVotes;
   private String party;

   // adding a new instance variable
   private String slogan;
   

   // The constructor creates a new Candidate object
   // and initializes the instance variables.
   public Candidate (String nameIn, String partyIn, String sloganIn) {
      name = nameIn;
      numVotes = 0; //no votes counted yet
      party = partyIn;
      slogan = sloganIn;
   }

   // This is a method that we can call on a Candidate
   // object. (Specifically, it is an accessor method).
   // This method creates and returns a String containing
   // all of the information about the state of the object.
   public String toString () {
      return "Name: "  + name + "\n"
           + "Number of Votes: "  + numVotes + "\n"
           + "Party: " + party + "\n"
           + "Campaign Slogan: " + slogan + "\n";
   }

   // Adding votes method
   public void addVotes (int addByVotes) {
      numVotes = numVotes + addByVotes;
   }

} // end of Candidate class
