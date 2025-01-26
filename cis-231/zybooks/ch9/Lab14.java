import java.util.Scanner;


public class Lab14 {

    public static void sortArray(int[] arr, int arrSize) {
        for (int i = arrSize-2; i >= 0; i--) {
            int num = arr[i];
            for (int j = i+1; j < arrSize; j++) {
                if (num < arr[j]) {
                    int temp = arr[j];
                    arr[j] = num;
                    arr[j-1] = temp;
                    continue;
                } break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        
        int ARR_LENGTH = scnr.nextInt();
        int[] arr = new int[ARR_LENGTH];
        for (int i = 0; i < ARR_LENGTH; i++) {
            arr[i] = scnr.nextInt();
        } scnr.close();

        sortArray(arr, arr.length);
        
        for (int i = 0; i < ARR_LENGTH; i++) {
            System.out.printf("%d,", arr[i]);
        } System.out.println();

    }
}
