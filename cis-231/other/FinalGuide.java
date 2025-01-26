import java.util.*;

public class FinalGuide {

    // #1
    public static ArrayList<Integer> doublesToInts(ArrayList<Double> doubleArr) {
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for (int i = 0; i < doubleArr.size(); i++) {
            double db = doubleArr.get(i);
            intArr.add((int)db);
        }
        return intArr;
    }

    // #2
    public static double getAverage(int[][] intRows) {
        int sum = 0;
        int totalNums = 0;
        for (int i = 0; i < intRows.length; i++) {
            int[] row = intRows[i];
            for (int j = 0; j < row.length; j++) {
                sum += row[j];
                totalNums++;
            }
        }
        return (sum * 1.0) / totalNums;
    }

    public static void main(String[] args) {

        // #1
        System.out.println("#1");
        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(10.9);
        doubles.add(11.5);
        doubles.add(1.9);
        doubles.add(5.4);
        doubles.add(6.9);
        ArrayList<Integer> ints = doublesToInts(doubles);
        for (int i = 0; i < ints.size(); i++) {
            System.out.println(ints.get(i));
        }
        System.out.println();

        // #2
        System.out.println("#2");
        int[][] intRows = new int[][]{{1,2,3,4,5}, {9,8,7,6,5}, {11,22,33,44}, {99,88,77,66}};
        System.out.println(getAverage(intRows));
        System.out.println();
    }
}
