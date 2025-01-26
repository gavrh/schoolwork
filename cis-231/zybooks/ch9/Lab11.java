import java.util.Scanner;


public class Lab11 {

    public static void exactChange(int total, int[] coins) {
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        
        while (total > 0) {
            int ammount = 0;
            if (total > quarter) {
                ammount = quarter * (int)(total/quarter);
                coins[3] += ammount / quarter;
            } else if (total > dime) {
                ammount = dime * (int)(total/dime);
                coins[2] += ammount / dime;
            } else if (total > nickel) {
                ammount = nickel * (int)(total/nickel);
                coins[1] += ammount / nickel;
            } else if (total >= penny) {
                ammount = penny * (int)(total/penny);
                coins[0] += ammount / penny;
            }
            total -= ammount;
        }
    }
    
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int total = scnr.nextInt();
        scnr.close();

        int[] coins = new int[]{0, 0, 0, 0};
        // [1,2,3,4,5]

        exactChange(total, coins);
        
        int change = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > 0) {
                change = 1;
                String coin = "";
                switch (i) {
                    case 3: 
                        coin = "quarter";
                        break;
                    case 2: 
                        coin = "dime";
                        break;
                    case 1:
                        coin = "nickel";
                        break;
                    default:
                        coin = "penn";
                        break;
                }
                System.out.printf("%d %s%s\n", coins[i], coin, coins[i] > 1 ? i == 0 ? "ies":"s" : i == 0 ? "y":"");
            }
        } if (change == 0) System.out.println("no change");
    
    }
}
