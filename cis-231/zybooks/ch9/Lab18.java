import java.util.Scanner;


public class Lab18 {

    public static void readSentences(Scanner scnr, String[] w1, String[] w2, int words) {
        for (int i = 0; i < 2; i++) {
            for (int x = 0; x < words; x++) {
                if (i%2==0) {
                    w1[x] = scnr.next();
                } else {
                    w2[x] = scnr.next();
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int ARR_SIZE = scnr.nextInt();
        String[] w1 = new String[ARR_SIZE];
        String[] w2 = new String[ARR_SIZE];

        readSentences(scnr, w1, w2, ARR_SIZE);
        scnr.close();

        for (int i = 0; i < ARR_SIZE; i++) {
            if (!w1[i].equals(w2[i])) System.out.printf("%s %s\n", w1[i], w2[i]);
        }
    }
}
