public class Main extends Rent {
    public static void main(String[] args) {

        Rent rent = new Rent();
        rent.RentFixed();


        Utility utility = new Utility();
        utility.InternetBill_Fixed();
        utility.ElectricityBill();
        utility.WaterBill();
        utility.GasBill();
        utility.TotalUtility();


        Food food = new Food();
        food.AiqFood();
        food.RayyanFood();
        food.ShadhinFood();
        food.Grocery_Total();
    }
    public void AtiqTotal(){
        for (double i = 1572.50; i <= Cash_Atiq; i++ ){
            if (i == Cash_Atiq){
                System.out.print("Atiq_Paid For August::");

            }else {
                System.out.print("You're Short::\\n" + i);

            }if (i != Cash_Atiq){
                System.out.print("Atiq Balance Overdue:: ");

            }

        }
    }
}
//Rayyan