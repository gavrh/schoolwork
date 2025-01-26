import java.util.Scanner;


public class Lab16 {

    public static int getMaxInt(int[] arr, int size) {
        int res = arr[0];
        for (int i = 1; i < size; i++) {
            if (res < arr[i]) res = arr[i];
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int ARR_SIZE = scnr.nextInt();
        int[] arr = new int[ARR_SIZE];
        for (int i = 0; i < ARR_SIZE; i++) {
            arr[i] = scnr.nextInt();
        } scnr.close();

        int max = getMaxInt(arr, ARR_SIZE);

        for (int i = 0; i < ARR_SIZE; i++) {
            System.out.printf("%d ", max-arr[i]);
        } System.out.println();
    }
}
