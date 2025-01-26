import java.util.Scanner;

public class Lab2 {
    
    public static void parseStrings(String line, Scanner scnr) {

        String first;
        String second;

        String[] arr = line.split(",", 0);
        if (arr[0].equals(line)) {
            System.out.println("Error: No comma in string.");
            return;
        }

        first = arr[0].replaceAll("\\s+", "");
        second = arr[1].replaceAll("\\s+", "");

        System.out.printf("First word: %s\n", first);
        System.out.printf("Second word: %s\n", second);

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        

        System.out.println("Enter input string:");
        String line = scnr.nextLine();

        while (!line.equals("q")) {
            parseStrings(line, scnr);
            System.out.println();
            System.out.println("Enter input string:");
            line = scnr.nextLine();
        } scnr.close();
    }
}

