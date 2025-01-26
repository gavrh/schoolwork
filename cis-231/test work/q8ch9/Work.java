import java.util.Scanner;


public class Work {

    public static void outputNormalizedAverage(double[] userValues, int userValsSize) {

        double average = 0;
        // add all values
        for (int i = 0; i < userValsSize; i++) {
            average += userValues[i];
        }

        // set to average
        average /= userValsSize;

        // output all values normalized to average
        for (int i = 0; i < userValsSize; i++) {
            // wasn't sure if you wanted me to limit decimal points so I just didn't...
            System.out.printf("%f\n", userValues[i] - average);
        }

    }


    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int ARR_SIZE = scnr.nextInt();
        double[] vals = new double[ARR_SIZE];

        for (int i = 0; i < ARR_SIZE; i++) {
            vals[i] = scnr.nextDouble();
        } scnr.close();

        outputNormalizedAverage(vals, ARR_SIZE);
    

    }
}
