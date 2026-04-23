import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        try {
            System.out.print("How many numbers? ");
            int n = sc.nextInt();

            System.out.println("Enter " + n + " numbers:");

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                sum += num;
                count++;
            }

            double avg = (double) sum / count;
            System.out.println("Average = " + avg);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only numbers!");

        } finally {
            System.out.println("Scanner resource released");
            sc.close();
        }
    }
}
