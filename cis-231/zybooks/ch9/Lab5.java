import java.util.Scanner;

public class Lab5 {

    public static int calcNumCharacters(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        // get variables
        char c = scnr.next().charAt(0);
        String str = scnr.nextLine();
        scnr.close();
        // function / output
        int n = calcNumCharacters(str, c);
        System.out.printf("%d %c%s\n", n, c, n != 1 ? "'s" : "");
    }
}
