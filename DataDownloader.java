// Thread class
class DataDownloader extends Thread {

    public void run() {

        while (true) {
            try {
                System.out.println("Downloading chunk...");
                Thread.sleep(2000); // 2 sec delay

            } catch (InterruptedException e) {
                System.out.println("Download cancelled by user. Cleaning up resources...");
                break; // exit loop
            }
        }
    }
}

// Main class
public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {

        DataDownloader downloader = new DataDownloader();

        downloader.start(); // start thread

        Thread.sleep(5000); // wait 5 sec

        downloader.interrupt(); // stop thread
    }
}
