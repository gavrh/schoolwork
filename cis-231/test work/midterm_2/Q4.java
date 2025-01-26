public class Q4 {
    
    public static double centered_average(int[] arr) {
        int high = arr[0];
        int low = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (high < arr[i]) high = arr[i];
            if (low > arr[i]) low = arr[i];
            sum += arr[i];
        }
        return (sum - high - low) / (arr.length - 2);
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,100};
        int[] arr2 = {1,1,5,5,10,8,7};
        int[] arr3 = {-10,-4,-2,-4,-2,0};

        System.out.println(centered_average(arr1));
        System.out.println(centered_average(arr2));
        System.out.println(centered_average(arr3));

    }
}
