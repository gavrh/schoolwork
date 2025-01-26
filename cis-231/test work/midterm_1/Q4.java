import java.util.Random;

public class Q4 {
    public static void main(String[] args) {

        Random rand = new Random();

        // (-100, 101) because rand.nextInt(origin, bound); origin is inclusive and bound is exclusive in the function
        int r1 = rand.nextInt(-100, 101);
        int r2 = rand.nextInt(-100, 101);

        System.out.printf("r1: %d, r2: %d, %s", r1, r2,
            r1 > r2 ? "r1 is larger"
            : r1 < r2 ? "r2 is larger"
            : "r1 and r2 are equal"
        );

    }
}