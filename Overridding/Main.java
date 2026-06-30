package Overridding;

class Payment {
    public void processPayment(double amount) {
        System.out.println("Processing ₹" + amount);
    }
}
class CreditCard extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("CreditCard: ₹" + amount + " + 2% fee");
    }
}
class UPI extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("UPI: ₹" + amount + " — Zero fee!");
    }
}
class NetBanking extends Payment {
    @Override
    public void processPayment(double amount) {
        super.processPayment(amount);  // calls parent
        System.out.println("+ ₹15 NetBanking fee");
    }
}
public class Main {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCard(), new UPI(), new NetBanking()
        };
        for (Payment p : payments) {
            p.processPayment(1000); // one call, 3 behaviours
        }
    }
}


