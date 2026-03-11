import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number: ");
        int number = scanner.nextInt();

        // Check if input is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        }

        scanner.close();
    }
}