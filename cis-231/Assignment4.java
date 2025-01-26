/*
    Gavin Holmes / gavin_holmes@my.cuesta.edu
    CIS231 / Assignment 4
    Cuesta / R. Scovil
    Due 04/10/2024
*/

// I didn't use a lot of comments in methods
// because I feel like either the name or
// code in the method is self explanatory

import java.util.Scanner;

public class CIS231A4GHol {

    // scan int within certain range
    public static int scanIntInRange(Scanner scnr, int low, int high) {
        int res;
        // loop until satisfied with input
        while (true) {
            res = scnr.nextInt();
            if (res >= low && res <= high) break;
            System.out.printf(
                "Integer entered is out of range (>= %d && <= %d). Try again:\n",
                low,
                high
            );
        }
        return res;
    }
    
    // scan double within certain range
    public static double scanDoubleInRange(Scanner scnr, double low, double high) {
        double res;
        // loop until satisfied with input
        while (true) {
            res = scnr.nextDouble();
            if (res >= low && res <= high) break;
            System.out.printf(
                "Double entered is out of range (>= %.1f && <= %.1f). Try again:\n",
                low,
                high
            );
        }
        return res;
    }
    
    // insertion sort
    public static void sortAscending(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]) {
                double temp = arr[j];
                arr[j] = arr[j-1];
                arr[--j] = temp;
            }
        }
    }
    
    // fahr array to cels values
    public static double[] fahrArrToCels(double[] fahrArr) {
        double[] celsArr = new double[fahrArr.length];
        for (int i = 0; i < celsArr.length; i++) {
            celsArr[i] = (fahrArr[i] - 32) * 5 / 9;
        }
        return celsArr;
    }
    
    // cels array to kelv values
    public static double[] celsArrToKelv(double[] celsArr) {
        double[] kelvArr = new double[celsArr.length];
        for (int i = 0; i < kelvArr.length; i++) {
            kelvArr[i] = celsArr[i] + 273.15;
        }
        return kelvArr;
    }

    public static double getAverage(double[] arr) {
        double count = 0.0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count / arr.length;
    }

    public static double getMax(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        return max;
    }

    public static double getMin(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }

    public static int aboveAverage(double[] arr, double avg) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > avg) count++;
        }
        return count;
    }

    public static int equalsAverage(double[] arr, double avg) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == avg) count++;
        }
        return count;
    }

    public static int belowAverage(double[] arr, double avg) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) count++;
        }
        return count;
    }

    public static double standardDeviation(double[] arr, double avg) {
        double count = 0.0;
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            // deviation calculation
            double deviation = Math.pow(arr[i] - avg, 2);
            count += deviation;
            // if deviation is 0, remove one from "length" to avoid deviding by zero
            if (deviation == 0.0) length--;
        }
        return Math.sqrt(count / length);
    }

    public static void printTable(
        double[] fahrArr,
        double[] celsArr,
        double[] kelvArr,
        double fahrAvg,
        double fahrMax,
        double fahrMin,
        double celsAvg,
        double celsMax,
        double celsMin,
        double kelvAvg,
        double kelvMax,
        double kelvMin,
        int aboveAvg,
        int equalAvg,
        int belowAvg,
        double stdDeviation
    ) {
        // I know this looks confusing and I'm not sure
        // how to explain without just saying the \t (tabs)
        // make it look messy but are the same as 
        // using multiple spaces

        // title
        System.out.println("\n\tCIS231 - Assignment 4 - Gavin Holmes\n");
        // temp types
        System.out.printf("\t\t\t Fahr \t\t Cels \t\t Kelv\n");
        System.out.printf("\t\t\t======\t\t======\t\t======\n");
        // temperatures in ascending order
        for (int i = 0; i < fahrArr.length; i++) {
            System.out.printf("\t\t\t %.1f \t\t %.1f \t\t %.1f\n", fahrArr[i], celsArr[i], kelvArr[i]);
        }
        System.out.printf("\t\t\t======\t\t======\t\t======\n");
        // avg, high, low
        System.out.printf("Average:\t\t %.1f \t\t %.1f \t\t %.1f\n\n", fahrAvg, celsAvg, kelvAvg);
        System.out.printf("High:\t\t\t %.1f \t\t %.1f \t\t %.1f\n\n", fahrMax, celsMax, kelvMax);
        System.out.printf("Low:\t\t\t %.1f \t\t %.1f \t\t %.1f\n\n", fahrMin, celsMin, kelvMin);
        // above, equal, below
        System.out.printf("Above Average:\t\t %d\n", aboveAvg);
        System.out.printf("Equal to Average:\t %d\n", equalAvg);
        System.out.printf("Below Average:\t\t %d\n\n", belowAvg);
        // standardd deviation
        System.out.printf("Standard Deviation:\t %.1f\n", stdDeviation);
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        
        // get array size
        System.out.println("Enter number of temperatures (>= 1 && <= 35):");
        int ARR_SIZE = scanIntInRange(scnr, 1, 35);

        // get values for temp array
        double[] fahrArr = new double[ARR_SIZE];
        for (int i = 0; i < ARR_SIZE; i++) {
            System.out.println("Enter a temperature (>= -150.0 && <= 350.0):");
            fahrArr[i] = scanDoubleInRange(scnr, -150.0, 350.0);
        } 
        // done using scanner
        scnr.close();
        
        // get values
        sortAscending(fahrArr);
        double[] celsArr = fahrArrToCels(fahrArr);
        double[] kelvArr = celsArrToKelv(celsArr);

        double fahrAvg = getAverage(fahrArr);
        double fahrMax = getMax(fahrArr);
        double fahrMin = getMin(fahrArr);

        double celsAvg = getAverage(celsArr);
        double celsMax = getMax(celsArr);
        double celsMin = getMin(celsArr);

        double kelvAvg = getAverage(kelvArr);
        double kelvMax = getMax(kelvArr);
        double kelvMin = getMin(kelvArr);

        int aboveAvg = aboveAverage(fahrArr, fahrAvg);
        int equalAvg = equalsAverage(fahrArr, fahrAvg);
        int belowAvg = belowAverage(fahrArr, fahrAvg);
        double stdDeviation = standardDeviation(fahrArr, fahrAvg);

        // print table
        printTable(
            fahrArr, celsArr, kelvArr,
            fahrAvg, fahrMax, fahrMin,
            celsAvg, celsMax, celsMin,
            kelvAvg, kelvMax, kelvMin,
            aboveAvg, equalAvg, belowAvg,
            stdDeviation
        );
    }
}
