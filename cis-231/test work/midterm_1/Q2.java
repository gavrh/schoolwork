import java.util.Random;

public class Q2 {
    public static void main(String[] args) {

        Random rand = new Random();
        double size = rand.nextDouble(7.0, 19.0);

        System.out.printf("%s\n",
            size < 8.0 ? "Below 8.0"
            : size <= 11.0 ? "Between 8.0 and 11.0"
            : size < 14.0 ? "Above 11.0 and less than 14.0"
            : size <= 18.0 ? "At least 14.0 and less than or equal to 18.0"
            : "Above 18.0"
        );
        

    }
}