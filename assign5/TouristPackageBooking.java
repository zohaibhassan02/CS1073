public class TouristPackageBooking extends ResortBooking {

   public TouristPackageBooking (String name, int numMeals, int numSpas){

      super (name, numMeals, numSpas); 

   }

   public double getCost (){
     // numSpas = super.getSpas();
     // numMeals = super.getSpas();
      if(super.getSpas() == 1){
         return 1475 + (35* super.getMeals()) + (125);
      }      
      else if(super.getSpas() > 1){
         return 1475 + (35 * super.getMeals()) + (125) + (100*(super.getSpas() - 1));
      }
      else {
         return 1475 + (35 * super.getMeals());
      }
   }

   public int getBuilding (){
      return 2 + (int)(Math.random() * 4);
   }


}
