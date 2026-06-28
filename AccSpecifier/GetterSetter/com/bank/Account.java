package AccSpecifier.GetterSetter.com.bank;

public class Account {
      private double balance = 1000.0;  // hidden from the world

    // public getter — read-only access for everyone
    public double getBalance() {
        return balance;               // direct access works here (same class)
    }

    // public setter — with validation before changing
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;           // ✓ private field, but we're inside Account
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // private helper — internal use only, hides logic from outside
    private void applyInterest() {
        balance = balance * 1.05;
    }

    // public method that internally calls private method
    public void yearEnd() {
        applyInterest();                // ✓ private method, same class — fine
        System.out.println("Balance: " + balance);
    }
}

