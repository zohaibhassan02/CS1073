public abstract class ResortBooking {

   private String guestName;
   private int numMeals;
   private int numSpas;

   public ResortBooking (String guestName, int numMeals, int numSpas){
      this.guestName = guestName;
      this.numMeals = numMeals;
      this.numSpas = numSpas;
      
   }

   public int getMeals (){
      return numMeals;
   }

   public int getSpas (){
      return numSpas;
   }

   public abstract double getCost ();
}
