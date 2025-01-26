import java.util.Scanner;


public class Lab12 {

    public static boolean isArrayMult10(int[] vals, int size) {
        boolean res = true;
        for (int i = 0; i < size; i++) {
            if (vals[i]%10 != 0) {
                res = false;
                break;
            }
        }
        return res;
    }
    public static boolean isArrayNoMult10(int[] vals, int size) {
        boolean res = true;
        for (int i = 0; i < size; i++) {
            if (vals[i]%10 == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int ARR_SIZE = scnr.nextInt();
        int[] vals = new int[ARR_SIZE];
        for (int i = 0; i < ARR_SIZE; i++) {
            vals[i] = scnr.nextInt();
        } scnr.close();

        boolean is = isArrayMult10(vals, vals.length);
        boolean isnt = isArrayNoMult10(vals, vals.length);

        if (is && isnt || !is && !isnt) {
            System.out.println("mixed values");
        } else if (is) {
            System.out.println("all multiples of 10");
        } else {
            System.out.println("no multiples of 10");
        }

    }
}
