public class TestQuestion {

    public static void main(String [] args) {
        // already been initialized with input
        double fahr = -1.0;

        if (fahr < 0.0)
            System.out.println("Below 0.0");
        else if (fahr <= 32.0)
            System.out.println("Between 0.0 and 32.0");
        else if (fahr < 72.0)
            System.out.println("Above 32.0 and less than 72.0");
        else if ((fahr >= 72.0) && (fahr <= 100.0))
            System.out.println("At least 72.0 and less than or equal to 100.0");
        else System.out.println("Above 100.0");


    }
}