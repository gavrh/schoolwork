import java.util.Scanner;

public class Quiz2Work {

    public static void main(String[] args) {

        // scanner
        Scanner scnr = new Scanner(System.in);

        // trapezoid values
        int trapTop = scnr.nextInt();
        int trapBottom = scnr.nextInt();
        int trapHeight = scnr.nextInt();

        // area output
        System.out.printf("%.2f\n", ((trapTop + trapBottom) / 2.0) * trapHeight);

    }

}