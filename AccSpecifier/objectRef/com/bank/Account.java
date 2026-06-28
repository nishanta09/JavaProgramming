package AccSpecifier.objectRef.com.bank;

public class Account {
     private   double balance     = 1000.0;   // only inside Account
              String ownerName  = "Alice";   // default = package-private
    protected String branch     = "Mumbai";  // package + subclasses
    public    String accountNo  = "ACC001";  // everywhere

    void showAll() {
        // Direct access — no object, no dot, just the name
        System.out.println(balance);    // ✓ private  — we ARE inside Account
        System.out.println(ownerName);  // ✓ default  — same class
        System.out.println(branch);     // ✓ protected — same class
        System.out.println(accountNo);  // ✓ public   — same class
    }
}
