import java.util.Scanner;

public class Lab1 {

    public static int feetToSteps(double feetWalked) {
        return (int)(feetWalked/2.5);
    }

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        // feet walked
        double feetWalked = scnr.nextDouble();
        scnr.close();
        // calculate
        int stepsWalked = feetToSteps(feetWalked);
        // output
        System.out.println(stepsWalked);

    }
}
