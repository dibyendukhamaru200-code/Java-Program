import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {

    public void divide(int a, int b) {
        System.out.println("Result = " + (a / b));
    }
}

public class Assignment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            c.divide(a, b);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only numbers!");

        } catch (Exception e) {
            System.out.println("Some other error occurred!");

        }

        sc.close();
    }
}
