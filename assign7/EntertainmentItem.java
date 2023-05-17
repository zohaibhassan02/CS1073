/**
 This class represents an entertainment item.
 @author Zohaib Khan - 3740572.
*/

public class EntertainmentItem {

    /**
     This is the description of the item.
    */
    private final String description;
    
    /**
     This is the price of the item.
    */
    private final double price;
    
    /**
     This lets us know if the item was donated or not.
    */
    private final boolean isDonated;

    /**
     This is the constructor method to initialize instance variables.
     @param description the description of the item.
     @param price the price of the item.
     @param isDonated whether the item is donated or not.
    */
    public EntertainmentItem(String description, double price, boolean isDonated) {
        this.description = description;
        this.price = price;
        this.isDonated = isDonated;
    }

    /**
     This method gets the description of the item.
     @return the description of the item.
    */
    public String getDescription() {
        return description;
    }

    /**
     This method gets the price of the item.
     @return the price of the item.
    */
    public double getPrice() {
        return price;
    }

    /**
     This method checks if the item is donated or not.
     @returns whether the item is donated or not.
    */
    public boolean getBenefactorDonated() {
        return isDonated;
    }
}
