import java.util.ArrayList;
import java.util.Scanner;

public class Lab3 {

    public static String getLine(Scanner scnr) {
        System.out.println();
        System.out.println("Enter a data point (-1 to stop input):");
        return scnr.nextLine();
    }
    public static void throwError(String message) {
        System.out.printf("Error: %s\n", message);
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        // data title and column names
        System.out.println("Enter a title for the data:");
        String dataTitle = scnr.nextLine();
        System.out.printf("You entered: %s\n\n", dataTitle);
        System.out.println("Enter the column 1 header:");
        String col1 = scnr.nextLine();
        System.out.printf("You entered: %s\n\n", col1);
        System.out.println("Enter the column 2 header:");
        String col2 = scnr.nextLine();
        System.out.printf("You entered: %s\n", col2);

        // data variables
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        String line = getLine(scnr);

        while (!line.equals("-1")) {
            // split comma and make sure format is correct
            String[] arr = line.split(",", 2);
            if (arr[0].equals(line)) {
                throwError("No comma in string.");
                line = getLine(scnr);
                continue;
            } else if (!arr[0].split(",", 0)[0].equals(arr[0]) || !arr[1].split(",", 0)[0].equals(arr[1])) {
                throwError("Too many commas in input.");
                line = getLine(scnr);
                continue;
            }

            // get name
            String name = arr[0];

            // get num and make sure num is an int
            int num;
            String strNum = arr[1].replaceAll("\\s+", "");
            try {
                num = Integer.parseInt(strNum);
            } catch (NumberFormatException nfe) {
                throwError("Comma not followed by an integer.");
                line = getLine(scnr);
                continue;
            }

            System.out.printf("Data string: %s\n", name);
            System.out.printf("Data integer: %d\n", num);
            names.add(name);
            nums.add(num);
            line = getLine(scnr);
        } scnr.close();

        System.out.printf("\n%33s\n", dataTitle);
        System.out.printf("%-20s|%23s\n", col1, col2);
        for (int i = 0; i < 44; i++) { System.out.print("-"); }
        System.out.println();
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%-20s|%23s\n", names.get(i), nums.get(i));
        } System.out.println();

        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%20s ", names.get(i));
            for (int j = 0; j < nums.get(i); j++) { System.out.print("*"); }
            System.out.println();
        }

    
    }
}
