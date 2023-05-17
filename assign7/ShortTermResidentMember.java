/**
 This is a class for short term resident members.
 @author Zohaib Khan - 3740572
*/

public class ShortTermResidentMember extends ResidentMember {

    /**
     The departure date of the member.
    */
    private String departureDate;

    /**
     The constructor method to initialize instance variables.
     @param fullName the full name of the member.
     @param phoneNumber the phone number of the member.
     @param departureDate the departure date of the member.
    */
    public ShortTermResidentMember (String fullName, int unitNumber, String phoneNumber, String departureDate) {
        super(fullName, unitNumber, phoneNumber);
        this.departureDate = departureDate;
    }

    /**
     This method gets the departure date of the member.
     @return the departure date of the member.
    */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     This method checks if signing out an entertainment item is successful or not.
     @param o the entertainment item that the member wants to sign out.
     @return if signing out the item was successful or not.
    */
    public boolean signOut(EntertainmentItem o) {
        if(!o.getBenefactorDonated()) {
            return super.signOut(o);
        }
        else{
            return false;
        }
    }

    /**
     This method checks if returning an entertainment item is successful or not.
     @param o the entertainment item that the member wants to return.
     @return if returning the item was successful or not.
    */
    public boolean returnItem(EntertainmentItem o) {
        return super.returnItem(o);
    }
}
