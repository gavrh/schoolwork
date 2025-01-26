import java.util.Scanner;


public class Lab6 {

    public static String removeNonAlpha(String str) {
        return str.replaceAll("([^a-zA-Z])", "");
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        
        String str = scnr.nextLine();
        scnr.close();

        String allAlpha = removeNonAlpha(str);

        System.out.println(allAlpha);

    }
}
