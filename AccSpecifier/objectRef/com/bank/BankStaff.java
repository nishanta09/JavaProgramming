package AccSpecifier.objectRef.com.bank;

class BankStaff {
     void check() {
        Account acc = new Account();  // create object → get a reference

        // Now access via the reference  "acc."
      // System.out.println(acc.balance);    // ✗ COMPILE ERROR — private, blocked everywhere outside Account
        System.out.println(acc.ownerName);  // ✓ default  — same package, allowed
        System.out.println(acc.branch);     // ✓ protected — same package, allowed
        System.out.println(acc.accountNo);  // ✓ public   — allowed everywhere
    }
}
