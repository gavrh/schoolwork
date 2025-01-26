import java.util.Scanner;


public class Lab8 {

    public static int maxNumber(int num1, int num2, int num3, int num4) {
        if (num1 < num2) num1 = num2;
        if (num1 < num3) num1 = num3;
        if (num1 < num4) num1 = num4;
        return num1;
    }
    public static int minNumber(int num1, int num2, int num3, int num4) {
        if (num1 > num2) num1 = num2;
        if (num1 > num3) num1 = num3;
        if (num1 > num4) num1 = num4;
        return num1;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int ARR_LENGTH = 4;
        int[] nums = new int[ARR_LENGTH];
        for (int i = 0; i < ARR_LENGTH; i++) {
            nums[i] = scnr.nextInt();
        } scnr.close();

        int max = maxNumber(nums[0], nums[1], nums[2], nums[3]);
        int min = minNumber(nums[0], nums[1], nums[2], nums[3]);

        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);
    }
}
