import java.util.*;

public class Q7 {

    public static ArrayList<Integer> allAboveAverage(ArrayList<Integer> ints) {
        int sum = 0;
        int currInt;
        for (int i = 0; i < ints.size(); i++) {
            currInt = ints.get(i);
            sum += currInt;
        }

        double average = (sum * 1.0) / ints.size();
        ArrayList<Integer> aboveAverage = new ArrayList<Integer>();

        for (int i = 0; i < ints.size(); i++) {
            currInt = ints.get(i);
            if (currInt > average) {
                aboveAverage.add(currInt);
            }
        }

        return aboveAverage;
    }

    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<Integer> aboveAverage;

        ints.add(2);
        ints.add(3);
        ints.add(5);
        ints.add(1);
        ints.add(3);
        ints.add(1);

        aboveAverage = allAboveAverage(ints);

        for (int i = 0; i < aboveAverage.size(); i++) {
            System.out.println(aboveAverage.get(i));
        }

    }
}
