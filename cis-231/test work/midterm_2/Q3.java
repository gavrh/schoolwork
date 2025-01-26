public class Q3 {

    public static double pow(double value, int exponent) {
        double val = 1.0;
        for (int i = 0; i < exponent; i++) {
            val *= value;
        }
        return val;
    }

    public static void main(String[] args) {

        System.out.println(pow(4.0, 4));
        System.out.println(Math.pow(4.0, 4.0));

    }
}
