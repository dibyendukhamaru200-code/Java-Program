// TrafficLight class
class TrafficLight implements Runnable {

    public void run() {

        try {
            // Normal traffic cycle
            while (true) {
                System.out.println("RED");
                Thread.sleep(2000);

                System.out.println("GREEN");
                Thread.sleep(2000);

                System.out.println("YELLOW");
                Thread.sleep(2000);
            }

        } catch (InterruptedException e) {

            // Emergency mode
            while (true) {
                System.out.println("BLINKING YELLOW... (Emergency Mode)");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    break;
                }
            }
        }
    }
}

// Main class
public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {

        TrafficLight tl = new TrafficLight();
        Thread t = new Thread(tl);

        // Set high priority
        t.setPriority(Thread.MAX_PRIORITY);

        // Start traffic light
        t.start();

        // Wait 7 seconds
        Thread.sleep(7000);

        // Emergency interrupt
        t.interrupt();
    }
}
