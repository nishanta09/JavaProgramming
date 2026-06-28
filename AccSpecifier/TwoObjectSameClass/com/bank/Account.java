package AccSpecifier.TwoObjectSameClass.com.bank;

public class Account {

    private double balance;
    private String pin;

    public Account(double bal, String pin) {
        this.balance = bal;
        this.pin     = pin;
    }

    // Can this account merge with another? Compare private fields directly!
    public boolean canMerge(Account other) {
        // "other" is a different object — yet we can read its private fields
        // because we are INSIDE the Account class definition
        return this.balance + other.balance > 5000   // ✓ other.balance — allowed!
            && this.pin.equals(other.pin);             // ✓ other.pin     — allowed!
    }

    // Copy constructor — reads private fields of the source object
    public Account(Account source) {
        this.balance = source.balance;   // ✓ perfectly legal
        this.pin     = source.pin;       // ✓ perfectly legal
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.run();

    }
}

// ─────── usage ───────
class Demo {
    void run() {
        Account a1 = new Account(3000, "1234");
        Account a2 = new Account(4000, "1234");

        System.out.println(a1.canMerge(a2));  // ✓ true

        Account a3 = new Account(a1);        // ✓ copy constructor works

     //   System.out.println(a1.balance);       // ✗ outside class — BLOCKED
    }
}
