import java.util.Scanner;


public class Lab15 {

    public static void getUserValues(int[] arr, int size, Scanner scnr) {
        for (int i = 0; i < size; i++) {
            arr[i] = scnr.nextInt();
        }
    }
    public static int intsLessThanOrEqualToThreshold(int[] userVals, int size, int threshold, int[] resVals) {
        int res = 0;
        for (int i = 0; i < size; i++) {
            if (userVals[i] <= threshold) {
                resVals[res] = userVals[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        int ARR_SIZE = scnr.nextInt();
        int[] arr = new int[ARR_SIZE];
        getUserValues(arr, ARR_SIZE, scnr);
        int THRESHOLD = scnr.nextInt();
        scnr.close();

        int[] res = new int[ARR_SIZE];
        int ammount = intsLessThanOrEqualToThreshold(arr, ARR_SIZE, THRESHOLD, res);

        for (int i = 0; i < ammount; i++) {
            System.out.printf("%d ", res[i];
        } System.out.println();
    }
}
