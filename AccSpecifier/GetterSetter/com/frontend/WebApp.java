package AccSpecifier.GetterSetter.com.frontend;

import AccSpecifier.GetterSetter.com.bank.Account;


public class WebApp {
    

    }

// ─────── from anywhere (even different package) ───────
class Client {
    void run() {
        Account acc = new Account();

     // acc.balance = 5000;             // ✗ direct field access — BLOCKED
        acc.setBalance(5000);           // ✓ public method — allowed

        double b = acc.getBalance();    // ✓ public getter — allowed

     // acc.applyInterest();            // ✗ private method — BLOCKED
        acc.yearEnd();                  // ✓ public method — allowed

        System.out.println(b);
    }
}
