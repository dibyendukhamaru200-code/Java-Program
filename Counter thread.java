// Thread class
class CounterThread extends Thread {

    long count = 0;
    boolean running = true;

    public void run() {

        while (running) {
            count++; // increase count
        }
    }
}

// Main class
public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {

        // Create threads
        CounterThread low = new CounterThread();
        CounterThread normal = new CounterThread();
        CounterThread high = new CounterThread();

        // Set priorities
        low.setPriority(Thread.MIN_PRIORITY);   // 1
        normal.setPriority(Thread.NORM_PRIORITY); // 5
        high.setPriority(Thread.MAX_PRIORITY);  // 10

        // Start threads
        low.start();
        normal.start();
        high.start();

        // Let them run for 3 seconds
        Thread.sleep(3000);

        // Stop threads
        low.running = false;
        normal.running = false;
        high.running = false;

        // Wait for threads to finish
        low.join();
        normal.join();
        high.join();

        // Print results
        System.out.println("Low Priority Count = " + low.count);
        System.out.println("Normal Priority Count = " + normal.count);
        System.out.println("High Priority Count = " + high.count);
    }
}
