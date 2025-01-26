import java.util.Scanner;


public class Lab1 {

    public static class Triangle {
        private double base;
        private double height;
   
        public void setBase(double userBase){
            base = userBase;
        }
        public void setHeight(double userHeight) {
            height = userHeight;
        }
   
        public double getArea() {
            double area = 0.5 * base * height;
            return area;
        }
   
        public void printInfo() {
            System.out.printf("Base: %.2f\n", base);
            System.out.printf("Height: %.2f\n", height);
            System.out.printf("Area: %.2f\n", getArea());
        }
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        triangle1.setBase(scnr.nextDouble());
        triangle1.setHeight(scnr.nextDouble());

        triangle2.setBase(scnr.nextDouble());
        triangle2.setHeight(scnr.nextDouble());

        System.out.println("Triangle with smaller area:");

        double t1Area = triangle1.getArea();
        double t2Area = triangle2.getArea();

        if (t1Area < t2Area) {
            triangle1.printInfo();
        } else {
            triangle2.printInfo();
        }

    }

}
