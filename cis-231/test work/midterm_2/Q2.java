public class Q2 {

    public static double[] percentArr(double[] arr) {
        double[] pArr = new double[arr.length];
        double sum = 0.0;
        // get sum
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        // calc percentages
        for (int i = 0; i < pArr.length; i++) {
            pArr[i] = arr[i]/sum;
        }
        return pArr;
    }

    public static void main(String[] args) {
        double[] dArr = {6.0, 5.0, 4.0, 5.0};
        double[] pArr = percentArr(dArr);
        for(int i = 0; i < pArr.length; i++) {
            System.out.println(pArr[i]);
        }
    }
}
