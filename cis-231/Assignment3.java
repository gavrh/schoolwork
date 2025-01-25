import java.util.Scanner;

public class Assignment3 {

    // fahrenheit to celcius
    static double fToC(double fDeg) {
        // return f to c calculation
        return ((fDeg - 32.0) * (5.0 / 9.0));
    }
    // fahrenheit to kelvin
    static double fToK(double fDeg) {
        // return f to k calculation
        return ((fDeg - 32.0) * (5 / 9.0) + 273.15);
    }
    // kelvin to fahrenheit
    static double kToF(double kDeg) {
        // return k to f calculation
        return ((kDeg - 273.15) * (9.0 / 5.0) + 32.0);
    }

    public static void main(String[] args) {
        
        // deg calc class / scanner
        Assignment3 degCalc = new Assignment3();
        Scanner scnr = new Scanner(System.in);

        // f values
        System.out.print("Enter 1st F° value: ");
        double fDeg1 = scnr.nextDouble();
        System.out.print("Enter 2nd F° value: ");
        double fDeg2 = scnr.nextDouble();
        System.out.print("Enter 3rd F° value: ");
        double fDeg3 = scnr.nextDouble();
        
        // 1st deg outputs
        System.out.printf(
            "\n1st: ( F %.2f, F->C %.2f, F->K %.2f, K->F %.2f )\n",
            fDeg1,
            degCalc.fToC(fDeg1),
            degCalc.fToK(fDeg1),
            degCalc.kToF(degCalc.fToK(fDeg1))
        );
        // 2nd deg outputs
        System.out.printf(
            "\n2nd: ( F %.2f, F->C %.2f, F->K %.2f, K->F %.2f )\n",
            fDeg2,
            degCalc.fToC(fDeg2),
            degCalc.fToK(fDeg2),
            degCalc.kToF(degCalc.fToK(fDeg2))
        );
        // 3rd deg outputs
        System.out.printf(
            "\n3rd: ( F %.2f, F->C %.2f, F->K %.2f, K->F %.2f )\n",
            fDeg3,
            degCalc.fToC(fDeg3),
            degCalc.fToK(fDeg3),
            degCalc.kToF(degCalc.fToK(fDeg3))
        );

    }
}
