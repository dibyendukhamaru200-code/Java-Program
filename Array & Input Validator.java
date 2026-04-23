import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --------- Part 1: Unchecked Exception Example ---------
        int[] arr = new int[3];

        try {
            System.out.print("Enter index (0 to 2): ");
            int index = sc.nextInt();

            System.out.print("Enter value: ");
            int value = sc.nextInt();

            arr[index] = value;
            System.out.println("Value inserted successfully!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range! Array size is 3.");
        }

        // --------- Part 2: Checked Exception Example ---------
        try {
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Checked Exception: Class not found!");
        }

        sc.close();
    }
}
