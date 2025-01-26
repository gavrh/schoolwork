import java.util.Scanner;

public class Lab3 {

    public static int maxMagnitude(int i1, int i2, int i3) {

        if (Math.abs(i1) < Math.abs(i2)) i1 = i2;
        if (Math.abs(i1) < Math.abs(i3)) i1 = i3;

        return i1;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        // ints
        int ARR_LENGTH = 3;
        int[] nums = new int[ARR_LENGTH];
        for (int i = 0; i < ARR_LENGTH; i++) {
            nums[i] = scnr.nextInt();
        } scnr.close();
        // function
        int max = maxMagnitude(nums[0], nums[1], nums[2]);
        // output
        System.out.println(max);

    }
}
