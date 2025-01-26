public class Q1 {
    
    public static void main(String [] args) {
        // already been initialized with input
        String one = "hello";
        String two = "helow";

        int sameChar = 0;
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) == two.charAt(i)) sameChar++;
        }
        System.out.println(sameChar);

    }
}
