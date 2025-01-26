import java.util.Scanner;

public class Lab2 {

    public static void swapValues(int[] nums) {
        int temp1 = nums[0];
        nums[0] = nums[1];
        nums[1] = temp1;

        int temp2 = nums[2];
        nums[2] = nums[3];
        nums[3] = temp2;
    }


    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        // get ints
        int ARR_LENGTH = 4;
        int[] nums = new int[ARR_LENGTH];
        for (int i = 0; i < ARR_LENGTH; i++) {
            nums[i] = scnr.nextInt();
        }
        scnr.close();
        // run function
        swapValues(nums);
        // output
        for (int i = 0; i < ARR_LENGTH; i++) {
            System.out.printf("%d ", nums[i]);
        } System.out.println();
    }

}
