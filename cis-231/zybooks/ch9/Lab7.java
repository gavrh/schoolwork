import java.util.Scanner;


public class Lab7 {

    public static String intToReverseBinary(int val) {
        String res = "";
        while (val > 0) {
            res = res + (char)(val%2 + '0');
            val /= 2;
        }
        return res;
    }
    public static String stringReverse(String str) {
        String res = "";
        for (int i = str.length()-1; i >= 0; i--) {
            res = res+str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        // input
        int val = scnr.nextInt();
        scnr.close();
        // functions
        String bin = intToReverseBinary(val);
        bin = stringReverse(bin);
        // output
        System.out.println(bin);
    }
}
