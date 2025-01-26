import java.util.Scanner;


public class Lab9 {

    public static String createAcronym(String phrase) {
        String res = "";

        // first char
        if (Character.isUpperCase(phrase.charAt(0))) res = res + phrase.charAt(0) + '.';

        for (int i = 1; i < phrase.length(); i++) {
            if (phrase.charAt(i-1) == ' ') {
                if (Character.isUpperCase(phrase.charAt(i))) res = res + phrase.charAt(i) + '.';
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String phrase = scnr.nextLine();
        scnr.close();

        String acronym = createAcronym(phrase);

        System.out.println(acronym);

    }
}
