import java.util.Scanner;


public class Lab10 {

    public static int daysInFeb(int year) {
        return (year % 100 == 0) ? ((year % 400 == 0) ? 29 : 28) : ((year % 4 == 0) ? 29 : 28);
    }

    public static void main(String[] args) {
    
        Scanner scnr = new Scanner(System.in);

        int year = scnr.nextInt();
        scnr.close();

        int days = daysInFeb(year);

        System.out.printf("%d has %d days in February.\n", year, days);

    }
}
