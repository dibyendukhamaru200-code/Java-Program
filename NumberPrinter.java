// Task A: Thread class
class NumberPrinter extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);

            try {
                Thread.sleep(500); // 500ms delay
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

// Task B: Runnable interface
class LetterPrinter implements Runnable {

    public void run() {

        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Letter: " + ch);
        }
    }
}

// Main class
public class Assignment4 {
    public static void main(String[] args) {

        // Thread using Thread class
        NumberPrinter t1 = new NumberPrinter();

        // Thread using Runnable interface
        LetterPrinter lp = new LetterPrinter();
        Thread t2 = new Thread(lp);

        // Start both threads
        t1.start();
        t2.start();
    }
}
