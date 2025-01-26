/*
    Gavin Holmes / gavin_holmes@my.cuesta.edu
    CIS231 / Assignment 5
    Cuesta / R. Scovil
    Due 05/03/2024
*/

import java.util.ArrayList;
import java.util.Scanner;

public class A5231GHolmes {

    public static void loopStringInputs(Scanner scnr, ArrayList<Integer> intArr) {
        String nextStr = "default";
        while (!nextStr.equals("")) {
            nextStr = scnr.nextLine();
            parseLineIntoArr(intArr, nextStr);
        }
    }

    public static void parseLineIntoArr(ArrayList<Integer> intArr, String line) {
        
        boolean valid = true;
        int lastWhitespace = -1;

        for (int i = 0; i < line.length(); i++) {
            if (Character.isWhitespace(line.charAt(i))) {
                if (valid) {
                    intArr.add(Integer.parseInt(line.substring(lastWhitespace+1, i)));
                }
                valid = true;
                lastWhitespace = i;
            } else if (!Character.isDigit(line.charAt(i))) {
                valid = false;
            }
        }

    }

    public static void insertionSort(ArrayList<Integer> intArr) {
        for (int i = 1; i < intArr.size(); i++) {
            int j = i;
            while (j > 0 && intArr.get(j) < intArr.get(j-1)) {
                int temp = intArr.get(j);
                intArr.set(j, intArr.get(j-1));
                intArr.set(j-1, temp);
                j--;
            }
        }
    }

    public static void printArr(ArrayList<Integer> intArr) {
        for (int i = 0; i < intArr.size(); i++) {
            System.out.printf("%d ", intArr.get(i));
            // if i + 1 (to make up for i starting at 0)
            // modulo 10 to see if its one of the 10th items
            // or its the last item in the array list
            if ((i+1) % 10 == 0 || i == intArr.size()-1) {
                System.out.println();
            }
        }
    }

    public static int getLow(ArrayList<Integer> intArr) {
        int low = intArr.get(0);
        for (int i = 1; i < intArr.size(); i++) {
            if (intArr.get(i) < low) low = intArr.get(i);
        }
        return low;
    }

    public static int getHigh(ArrayList<Integer> intArr) {
        int high = intArr.get(0);
        for (int i = 1; i < intArr.size(); i++) {
            if (intArr.get(i) > high) high = intArr.get(i);
        }
        return high;
    }

    public static double getAverage(ArrayList<Integer> intArr) {
        int sum = 0;
        for (int i = 0; i < intArr.size(); i++) {
            sum += intArr.get(i);
        }
        return sum * 1.0 / intArr.size();
    }

    public static int[] getModeAndFreq(ArrayList<Integer> intArr) {
        int maxFreq = 0;
        int mode = Integer.MIN_VALUE;
        int[] freqArr = new int[1024]; // just a guess of the range

        for (int i = 0; i< intArr.size(); i++) {
            int num = intArr.get(i);
            freqArr[num]++;
            if (freqArr[num] > maxFreq) {
                maxFreq = freqArr[num];
                mode = num;
            }
        }

        return new int[]{mode, maxFreq};
    }

    public static void main(String[] args) {

        // starter variables
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> intArr = new ArrayList<Integer>();

        // get and sort array
        loopStringInputs(scnr, intArr);
        scnr.close();
        insertionSort(intArr);

        // variables from array
        int low = getLow(intArr);
        int high = getHigh(intArr);
        double average = getAverage(intArr);
        int[] modeAndFreq = getModeAndFreq(intArr);
        int mode = modeAndFreq[0];
        int freq = modeAndFreq[1];

        // output
        System.out.println("CIS 231 - Assignment 5");
        System.out.printf("Size: %d\n", intArr.size());
        printArr(intArr);
        System.out.printf("Low: %d\n", low);
        System.out.printf("High: %d\n", high);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Mode: %d\n", mode);
        System.out.printf("Freq: %d\n", freq);

    }
}
