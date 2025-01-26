import java.util.Scanner;


public class Lab17 {

    public static int getWordFrequency(String[] arr, int size, String _word) {
        int res = 0;
        String word = _word.toLowerCase();
        for (int i = 0; i < size; i++) {
            if (arr[i].toLowerCase().equals(word)) res++;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int ARR_SIZE = scnr.nextInt();
        String[] arr = new String[ARR_SIZE];
        for (int i = 0; i < ARR_SIZE; i++) {
            arr[i] = scnr.next();
        } scnr.close();

        for (int i = 0; i < ARR_SIZE; i++) {
            System.out.printf("%s %d\n", arr[i], getWordFrequency(arr, ARR_SIZE, arr[i]));
        }
    }
}
