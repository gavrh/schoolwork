public class CarClass {
    public static void main(String[] args) {
        
        Car myCar = new Car("Ferrari", "SF80", "Red", 4);
        
        myCar.drive();
        myCar.printDetails();
        
    }
}

class Car {
    // fields
    String brand;
    String model;
    String color;
    int numWheels;
    
    public Car(String brand, String model, String color, int numWheels) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numWheels = numWheels;
    }
    
    public void drive() {
        System.out.println("The car is driving!");
    }
    
    public void printDetails() {
        System.out.printf("Brand: %s\n", brand);
        System.out.printf("Model: %s\n", model);
        System.out.printf("Color: %s\n", color);
        System.out.printf("# Wheels: %d\n", numWheels);
    }
}