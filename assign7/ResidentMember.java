/**
 This class represents a resident member.
 @author Zohaib Khan - 3740572
*/

public class ResidentMember {

    /**
     This is the full name of the member.
    */
    private String fullName;
    
    /**
     This is the member's congo unit number.
    */
    private int unitNumber;
    
    /**
     This is the member's phone number.
    */
    private String phoneNumber;
    
    /**
     This is the membership number assigned to the member.
    */
    private final int membershipNumber;
    
    /**
     This is a counter to increment the membership number for each member.
    */
    private static int nextNumber = 500000;

    /**
     This is an object of EntertainmentItem class.
    */
    private EntertainmentItem[] items;
    
    /**
     This is a counter variable of the items array.
    */
    private int itemsCounter;

    /**
     This is the constructor method to initialize the instance variables.
     @param fullName the full name of the member.
     @param unitNumber the member's congo unit number.
     @param phoneNumber the member's phone number.
    */
    public ResidentMember(String fullName, int unitNumber, String phoneNumber) {
        this.fullName = fullName;
        this.unitNumber = unitNumber;
        this.phoneNumber = phoneNumber;

        membershipNumber = nextNumber;
        nextNumber++;

        items = new EntertainmentItem[7];
        itemsCounter = 0;
    }

    /**
     This method gets the member's name.
     @return the full name of the member.
    */
    public String getName() {
        return fullName;
    }

    /**
     This method returns the member's congo unit number.
     @return the member's congo unit number.
    */
    public int getUnitNumber() {
        return unitNumber;
    }

    /**
     This method returns the member's phone number.
     @return the member's phone number.
    */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     This method returns the member's membership number.
     @return the member's membership number.
    */
    public int getMembershipNumber() {
        return membershipNumber;
    }

    /**
     This method sets the member's phone number.
     @param phoneNumber the member's phone number.
    */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     This method returns the list of items signed out by the member.
     @return itemList the list of items signed out by the member.
    */
    public EntertainmentItem[] getSignedOutItems() {
        EntertainmentItem[] itemList = new EntertainmentItem[itemsCounter];
        for (int i = 0; i < itemList.length; i++) {
            itemList[i] = items[i];
        }
        return itemList;
    }

    /**
     This method checks if signing out an entertainment item is possible or not.
     @param o the entertainment item the member is attempting to sign out.
     @return if signing out the item was successful or not
    */
    public boolean signOut(EntertainmentItem o) {
        boolean flag = false;
        if (itemsCounter < items.length) {
            items[itemsCounter] = o;
            itemsCounter++;
            flag = true;
        } else {
            flag = false;

        }
        return flag;
    }

    /**
     This method checks if signing out an entertainment item is possible or not.
     @param o the entertainment item the member is attempting to sign out.
     @return if signing out the item was successful or not
    */
    public boolean returnItem(EntertainmentItem o) {
        boolean flag = false;
        for (int i = 0; i < itemsCounter && !flag; i++) {
            if (items[i] == o) {
                for (int j = i; j < itemsCounter - 1; j++) {
                    items[j] = items[j + 1];
                }
                itemsCounter--;
                items[itemsCounter] = null;
                flag = true;
                return flag;

            }
        }
        return flag;
    }
}

