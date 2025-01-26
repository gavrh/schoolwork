import java.util.*;

public class Q4 {

public static boolean hasDuplicate(ArrayList<Integer> ints) {
    int prev = ints.get(0);
    int curr;
    for (int i = 1; i < ints.size(); i++) {
        curr = ints.get(i);
        if (curr == prev) {
            return true;
        }
        prev = curr;
    }
    return false;
}
    
    public static void main(String[] args) {

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(4);
        ints.add(5);

        System.out.println(hasDuplicate(ints));
    }
}
