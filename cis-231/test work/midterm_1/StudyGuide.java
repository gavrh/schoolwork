import java.util.Random;
import java.util.Scanner;

public class StudyGuide {

    public static class Point {

        private double x;
        private double y;
    
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    
        public double getX() {
            return this.x;
        }
        public double getY() {
            return this.y;
        }
    
    }

    public static class RightTriangle {

        // instance variables
        private double sideA, sideB, hypotenuse;

        // constructors
        public RightTriangle() {
            this.sideA = 10.0;
            this.sideB = 10.0;
            this.setHypotenuse();
        }
        public RightTriangle(double side) {
            this.sideA = side;
            this.sideB = side;
            this.setHypotenuse();
        }
        public RightTriangle(double sideA, double sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.setHypotenuse();
        }
        // hypotenuse func
        private void setHypotenuse() {
            this.hypotenuse = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideA, 2));
        }
        
        // accessors
        public double getSideA() {
            return sideA;
        }
        public double getSideB() {
            return sideB;
        }
        public double getHypo() {
            return hypotenuse;
        }

        // print/label
        public String toString() {
            return "SideA: " + sideA + ", SideB: " + sideB + ", Hypotenuse: " + hypotenuse;
        }

    }

    public static int oddEven(int x) {
        return x%2;
    }

    public static void main(String[] args) {
    // [1]
        // create instances
        Point instance1 = new Point(1.111111, 2.222222);
        Point instance2 = new Point(3.333333, 4.444444);
        Point instance3 = new Point(5.555555, 6.666666);
        // output instances labeled x and y w/ 2 decimals places
        System.out.printf("x:%.2f, y:%.2f\n", instance1.getX(), instance1.getY());
        System.out.printf("x:%.2f, y:%.2f\n", instance2.getX(), instance2.getY());
        System.out.printf("x:%.2f, y:%.2f\n", instance3.getX(), instance3.getY());

    // [2]
        // classes and prompts
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        int low = 0; // scnr.nextInt()
        int high = 10; // scnr.nextInt()

        // random values & tests
        System.out.printf("%d %d %d\n", rand.nextInt(low+1, high), rand.nextInt(low+1, high), rand.nextInt(low+1, high));
        // excluded
        scnr.close();

    // [3]
        // instances w/ different constructors
        RightTriangle triangle1 = new RightTriangle();
        RightTriangle triangle2 = new RightTriangle(25.0);
        RightTriangle triangle3 = new RightTriangle(15.5, 35.5);
        // outputs
        System.out.println(triangle1.toString());
        System.out.println(triangle2.toString());
        System.out.println(triangle3.toString());
    // [4]
        // x valute integer
        int x = rand.nextInt(-1, 101);
        // output
        System.out.printf("%s\n",
            x < 0 || x > 99 ? "invalid" 
            : x >= 50 && x <= 79 ? "ineligible receiver"
            : "eligible receiver"
        );
    // [5]
        int value = rand.nextInt(0, 1000);
        int answer;

        answer = oddEven(value);
        // test
        System.out.println(value + " " + answer);
    }
}