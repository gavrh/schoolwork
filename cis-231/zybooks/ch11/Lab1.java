import java.util.Scanner;
import java.util.ArrayList;

public class Lab1 {
    public static int getMonthAsInt(String monthString) {
        int monthInt;
        
        // Java switch/case statement                                                                
        switch (monthString) {
            case "January": 
                monthInt = 1; 
                break;
            case "February": 
                monthInt = 2; 
                break;
            case "March": 
                monthInt = 3; 
                break;
            case "April": 
                monthInt = 4; 
                break;
            case "May": 
                monthInt = 5; 
                break;
            case "June": 
                monthInt = 6; 
                break;
            case "July": 
                monthInt = 7; 
                break;
            case "August": 
                monthInt = 8; 
                break;
            case "September": 
                monthInt = 9; 
                break;
            case "October": 
                monthInt = 10; 
                break;
            case "November": 
                monthInt = 11; 
                break;
            case "December": 
                monthInt = 12; 
                break;
            default: 
                monthInt = 0;
        }
        
        return monthInt;
    }

    public static ArrayList<String> parseDates(Scanner scnr) {

        ArrayList<String> dates = new ArrayList<String>();
        String line = scnr.nextLine();

        while (!line.equals("-1")) {
            int month = 0;
            int date;
            int year;
            int i;
            int j;

            // month
            i = 0;
            while (i < line.length()) {
                if (Character.isWhitespace(line.charAt(i))) {
                    month = getMonthAsInt(line.substring(0, i));
                    break;
                }
                i++;
            }
            if (month == 0) {
                line = scnr.nextLine();
                continue;
            }

            // date
            j=i+1;
            i+=3;
            if (Character.isWhitespace(line.charAt(i))) i--;
            if (line.charAt(i) != ',') {
                line = scnr.nextLine();
                continue;
            } else {
                date = Integer.parseInt(line.substring(j, i));
            }

            // year
            i+=2;
            year = Integer.parseInt(line.substring(i, line.length()));

            dates.add(String.format("%d-%d-%d", month, date, year));
            line = scnr.nextLine();
        }

        return dates;
    }
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // TODO: Read dates from input, parse the dates to find the ones
        //       in the correct format, and output in m-d-yyyy format

        ArrayList<String> dates = parseDates(scnr);
        scnr.close();

        for (int i = 0; i < dates.size(); i++) {
            System.out.println(dates.get(i));
        }
     
    }
}
