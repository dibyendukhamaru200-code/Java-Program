import java.util.ArrayList;

// Shared class
class Bakery {

    ArrayList<String> tray = new ArrayList<>();
    int MAX_CAPACITY = 5;

    // Producer
    public synchronized void bakeBread() {

        while (true) {

            while (tray.size() == MAX_CAPACITY) {
                try {
                    wait();
                } catch (Exception e) {}
            }

            tray.add("Loaf");
            System.out.println("Produced, Tray size: " + tray.size());

            notifyAll();

            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }

    // Consumer
    public synchronized void buyBread() {

        while (true) {

            while (tray.size() == 0) {
                try {
                    wait();
                } catch (Exception e) {}
            }

            tray.remove(0);
            System.out.println("Consumed, Tray size: " + tray.size());

            notifyAll();

            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

// Producer Thread
class Baker extends Thread {

    Bakery b;

    Baker(Bakery b) {
        this.b = b;
    }

    public void run() {
        b.bakeBread();
    }
}

// Consumer Thread
class Customer extends Thread {

    Bakery b;

    Customer(Bakery b) {
        this.b = b;
    }

    public void run() {
        b.buyBread();
    }
}

// Main class
public class Assignment4 {
    public static void main(String[] args) {

        Bakery b = new Bakery();

        Baker baker = new Baker(b);
        Customer customer = new Customer(b);

        baker.start();
        customer.start();
    }
}
