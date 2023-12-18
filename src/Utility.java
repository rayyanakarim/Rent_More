import java.util.Scanner;

public class Utility extends Food {
    double WaterBill;
    double GasBill;
    double ElectricityBill;
    protected int InternetBill = 77;

    public void WaterBill() {
        Scanner scanner = new Scanner(System.in);
        WaterBill = scanner.nextDouble();
        System.out.println("WaterBill::\\n" + WaterBill);
    }

    public void GasBill() {
        Scanner scanner = new Scanner(System.in);
        GasBill = scanner.nextDouble();
        System.out.println("GasBill::\\n" + GasBill);
    }

    public void ElectricityBill() {
        Scanner scanner = new Scanner(System.in);
        ElectricityBill = scanner.nextDouble();
        System.out.println("ElectricityBill::\\n" + ElectricityBill);

    }

    public void InternetBill_Fixed() {

        System.out.println("InternetBill::\\n" + InternetBill);
    }
    public void TotalUtility(){
        double UtilityTotal = WaterBill + GasBill + ElectricityBill + InternetBill;
        System.out.println("TotalUtility::\\n"+ UtilityTotal);
    }
}