class BankAccount {

    int balance = 1000;

    // synchronized method
    public synchronized void withdraw(int amount) {

        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrawing...");

            try {
                Thread.sleep(100);
            } catch (Exception e) {}

            balance = balance - amount;
            System.out.println("Balance left: " + balance);

        } else {
            System.out.println("Not enough balance");
        }
    }
}

class FamilyMember extends Thread {

    BankAccount acc;

    FamilyMember(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(1000);
    }
}

public class Assignment1 {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        FamilyMember t1 = new FamilyMember(acc);
        FamilyMember t2 = new FamilyMember(acc);

        t1.setName("User1");
        t2.setName("User2");

        t1.start();
        t2.start();
    }
}
