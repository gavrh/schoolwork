public class Lab10 {
    // TODO: Build BankAccount class with methods listed above
    private String  customerName;
    private double  checkingBalance;
    private double  savingsBalance;

    public Lab10(String newName, double amt1, double amt2) {
        customerName = newName;
        checkingBalance = amt1;
        savingsBalance = amt2;
    }

    public void setName(String newName) { customerName = newName; }
    public String getName() { return customerName; }

    public void setChecking(double amt) { checkingBalance = amt; }
    public double getChecking() { return checkingBalance; }

    public void setSavings(double amt) { savingsBalance = amt; }
    public double getSavings() { return savingsBalance; }

    public void depositChecking(double amt) {
        if (amt > 0.0) {
            checkingBalance += amt;
        }
    }
    public void depositSavings(double amt) {
        if (amt > 0.0) {
            savingsBalance += amt;
        }
    }

    public void withdrawChecking(double amt) {
        if (amt > 0.0) {
            checkingBalance -= amt;
        }
    }
    public void withdrawSavings(double amt) {
        if (amt > 0.0) {
            savingsBalance -= amt;
        }
    }

    public void transferToSavings(double amt) {
        if (amt > 0.0) {
            checkingBalance -= amt;
            savingsBalance += amt;
        }
    }
    
    
    // main
    public static void main(String args[]) {
        Lab10 account = new Lab10("Mickey", 500.00, 1000.00);
        account.setChecking(500);
        account.setSavings(500);
        account.withdrawSavings(100);
        account.withdrawChecking(100);
        account.transferToSavings(300);

        System.out.println(account.getName()); // Expected Mickey
        System.out.printf("$%.2f\n", account.getChecking()); // Expected 100.0
        System.out.printf("$%.2f\n", account.getSavings()); // Expected 700.0
    } 
}
