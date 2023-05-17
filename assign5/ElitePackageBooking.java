public class ElitePackageBooking extends ResortBooking {

    public ElitePackageBooking (String name, int numMeals, int numSpas){

      super (name, numMeals, numSpas); 

   }

   public double getCost (){
     // numSpas = super.getSpas();
     // numMeals = super.getSpas();
      if(super.getMeals() > 3){
         return 2250 + (75* super.getSpas()) + ((super.getMeals() - 3) * 35);
      }      
      else{
         return 2250 + (75 * super.getSpas());
      }
   }

   public int getBuilding (){
      return 1;
   }
}	
