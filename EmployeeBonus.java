import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int yearsOfService = scanner.nextInt();

        // Bonus calculation
        if (yearsOfService > 5) {
            double bonus = salary * 0.05; // 5% bonus
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus awarded. Years of service must be more than 5.");
        }

        scanner.close();
    }
}