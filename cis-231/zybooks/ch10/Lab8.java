import java.util.Scanner;


public class Lab8 {

    private int num;
    
    public Lab8(int n) {
        num = n;
    }
    
    public String toString() {
        return String.format("The value is %d", num);
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNum(int n) {
        num = n;
    }
    
    public static void main(String [] args) {
        Scanner scnr = new Scanner(System.in);
        int inputNum = scnr.nextInt();
        Lab8 yourNum = new Lab8(inputNum);
        System.out.print(yourNum);
    }


}
