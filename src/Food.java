import java.util.Scanner;

public class Food extends Cash {

    double GroceryBill_A;
    double GroceryBill_R;
    double GroceryBill_S;


    public void AiqFood(){
        Scanner scanner = new Scanner(System.in);
        GroceryBill_A = scanner.nextInt();
        System.out.print("AiqFood::\\n" + GroceryBill_A);
    }
    public void RayyanFood(){
        Scanner scanner = new Scanner(System.in);
        GroceryBill_R = scanner.nextInt();
        System.out.print("RayyanFood::\\n" + GroceryBill_R);
    }
    public void ShadhinFood(){
        Scanner scanner = new Scanner(System.in);
        GroceryBill_S = scanner.nextInt();
        System.out.print("ShadhinFood::\\n" + GroceryBill_S);
    }
    public void Grocery_Total(){
        double FoodTotal = GroceryBill_A + GroceryBill_R + GroceryBill_S;
        System.out.print("Grocery_Total::\\n" + FoodTotal );
    }

}
