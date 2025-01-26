import java.util.Scanner;
import java.util.Random;

public class Lab4 {

    public static String coinFlip(Random rand) {
        int random = rand.nextInt(2);
        return (random == 0) ? "Tails" : "Heads";
    }

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2);

        // scan 
        int AMMOUNT = scnr.nextInt();
        // output
        for (int i = 0; i < AMMOUNT; i++) {
            System.out.println(coinFlip(rand));
        }

    }
}
