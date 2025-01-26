import java.util.Scanner;
import java.util.ArrayList;

public class MidtermSG {

    // #1
    public static double getDiff(double[] arr) {
        double high = arr[0];
        double low = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (high < arr[i]) high = arr[i];
            if (low > arr[i]) low = arr[i];
        }

        return high - low;
    }

    // #2
    public static ArrayList<Integer> arrToList(int[] intArr) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) list.add(intArr[i]);
        }

        return list;
    }

    // #3 test class
    public static class Point {
        public int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // #5
    public static String firstAlpha(String[] strArr) {
        String low = strArr[0];

        for (int i = 1; i < strArr.length; i++) {
            if(low.charAt(0) > strArr[i].charAt(0)) low = strArr[i];
        }

        return low;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        
        // code for #1
        double[] dbArr = {1.0, 2.0, 3.0, 4.0, 10.0};
        double val1 = getDiff(dbArr);
        System.out.println(val1); // should ouput "9.0"

        // code for #2
        int[] intArr = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = arrToList(intArr);
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d ", list.get(i));
        } System.out.println(); // should output "2 4"

        // code for #3
        Point one = new Point(3, 5);
        Point two = new Point(20, 20);
        Point three = one;
        Point four = one;
        Point five = two;
        Point six = new Point(0, 0);
        // creates 3 instances

        // code for #4
        int[] first = {5, 7, 3, 2, 9, 11};
        int[] second = first;
        first[3] = 12;
        System.out.println(second[3]);

        // code for #5
        String[] strArr = {"Hello", "world", "Goodbye", "mom"};
        String alpha = firstAlpha(strArr);
        System.out.println(alpha); // should output "Goodbye";
        
        scnr.close();
    }
}