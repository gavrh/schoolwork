import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // gather info
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your major: ");
        String major = scanner.nextLine();

        System.out.print("Enter your hometown: ");
        String hometown = scanner.nextLine();


        System.out.print("Enter your interests (comma-separated): ");
        String interests = scanner.nextLine();
        
        // output
        System.out.println("\nStudent Information:");
        System.out.printf("Name: %s\n", fullName);
        System.out.printf("Major: %s\n", major);
        System.out.printf("Hometown: %s\n", hometown);
        System.out.printf("Interests: %s\n", interests);

        scanner.close();
    }
}
