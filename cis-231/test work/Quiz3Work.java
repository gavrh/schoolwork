import java.util.Scanner;

public class Octagon {

    // side length private instance variable
    private double sideLength;

    // class constructor
    public Octagon(double sideLength) {
        // set side length to parameter
        this.sideLength = sideLength;
    }

    // side length accessor
    public double getSideLength() {
        // return side length private instance variable
        return this.sideLength;
    } 

    // contents of side length in a string
    public String toString() {
        return "Side length: " + this.sideLength;
    }

    public static void main(String[] args) {

        // testing //
        
        // create class
        Octagon oct = new Octagon(9.90);
        // output side length
        System.out.println(oct.getSideLength());
        // output side length string
        System.out.println(oct.toString());

    }

}