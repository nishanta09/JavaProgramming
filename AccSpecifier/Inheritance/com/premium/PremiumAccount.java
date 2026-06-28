package AccSpecifier.Inheritance.com.premium;

import AccSpecifier.Inheritance.com.bank.Account;


// ─────── subclass in a DIFFERENT package ───────



public class PremiumAccount extends Account {

        void work() {
        // FIELDS — direct / inherited access
    //    System.out.println(balance);    // ✗ private   — never inherited
    //    System.out.println(ownerName);  // ✗ default   — diff package, blocked
        System.out.println(branch);     // ✓ protected — inherited, accessible
        System.out.println(accountNo);  // ✓ public    — accessible

        // METHODS — same rules apply
    //    secretAudit();                  // ✗ private method
    //    packageHelp();                  // ✗ default method — diff package
        applyBonus();                   // ✓ protected method — subclass can call
        printSlip();                    // ✓ public method
    }

}
