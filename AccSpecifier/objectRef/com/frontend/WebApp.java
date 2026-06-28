package AccSpecifier.objectRef.com.frontend;

import AccSpecifier.objectRef.com.bank.Account;


public class WebApp {
    
     void check() {
        Account acc = new Account();

        // System.out.println(acc.balance);    // ✗ private
        // System.out.println(acc.ownerName);  // ✗ default  — different package, BLOCKED
        // System.out.println(acc.branch);     // ✗ protected — not a subclass, BLOCKED
        System.out.println(acc.accountNo);  // ✓ public   — only this works
    }
}
