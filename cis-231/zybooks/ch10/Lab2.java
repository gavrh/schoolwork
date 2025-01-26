import java.util.Scanner;
import java.lang.Math;

public class Lab2 {
    
    public static class Car {
        private int modelYear;
        private int purchasePrice;
        private int currentValue;

        public void setModelYear(int userYear) {
            modelYear = userYear;
        }
        public int getModelYear() {
            return modelYear;
        }

        public void setPurchasePrice(int userPrice) {
            purchasePrice = userPrice;
        }
        public int getPurchasePrice() {
            return purchasePrice;
        }

        public void calcCurrentValue(int currentYear) {
            double depreciationRate = 0.15;
            int carAge = currentYear - modelYear;

            currentValue = (int) Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
        }

        public void printInfo() {
            System.out.println("Car's information:");
            System.out.printf("  Model year: %d\n", modelYear);
            System.out.printf("  Purchase price: $%d\n", purchasePrice);
            System.out.printf("  Current value: $%d\n", currentValue);
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        Car myCar = new Car();
        
        int userYear = scnr.nextInt();
        int userPrice = scnr.nextInt();
        int userCurrentYear = scnr.nextInt();
        
        myCar.setModelYear(userYear);
        myCar.setPurchasePrice(userPrice);
        myCar.calcCurrentValue(userCurrentYear);
        
        myCar.printInfo();
    }
}
