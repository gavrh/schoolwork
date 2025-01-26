import java.util.Scanner;

public class Quiz4Work {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

// get number of inputs
System.out.println("Enter the value of integers:");
int inputNum = in.nextInt();

// loop through
for (int i = 0; i < inputNum; ++i) {

    // ask for input
    System.out.printf("Enter the value of integer #%d:\n", i+1);
    int inputVal = in.nextInt();
    // output if even or not
    System.out.println(inputVal + " is " + (inputVal % 2 == 0 ? "even" : "odd"));

}

    }
}