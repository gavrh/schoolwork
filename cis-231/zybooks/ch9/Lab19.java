import java.util.Scanner;


public class Lab19 {

    public static int getNumOfCharacters(final String usrStr) {
        return usrStr.length();
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter a sentence or phrase:");
        String phrase = scnr.nextLine();
        scnr.close();
        System.out.printf("\nYou entered: %s\n", phrase);
        System.out.println();
        System.out.printf("Number of characters: %d\n", getNumOfCharacters(phrase));
        System.out.printf("String with no whitespace: %s\n", phrase.replace(" ", ""));

    }
}
