import java.util.Scanner;  // Read input from the user

public class PayrollCalculator {

    public static void main(String[] args) {

        // Constant for the tax rate (20%)
        final double TAX_RATE = 0.20;

        // Create Scanner object to read from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Get the employee's name (String type)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get hourly wage (double type) with basic validation
        System.out.print("Enter your hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        // Basic check: wage should not be negative
        if (hourlyWage < 0) {
            System.out.println("Warning: Hourly wage cannot be negative. Using $0.00 instead.");
            hourlyWage = 0.0;
        }

        // Get hours worked (int type) with basic validation
        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();

        // Basic check: hours should not be negative
        if (hoursWorked < 0) {
            System.out.println("Warning: Hours worked cannot be negative. Using 0 hours instead.");
            hoursWorked = 0;
        }

        // Do not close scanner here to avoid potential issues in some environments

        // Perform the required calculations using arithmetic operators
        double grossSalary  = hourlyWage * hoursWorked;     // multiplication
        double tax          = grossSalary * TAX_RATE;       // multiplication
        double netSalary    = grossSalary - tax;            // subtraction

        // Display the payroll summary exactly as requested
        System.out.println("\nPayroll Summary for " + name);
        System.out.println("-----------------------------------");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Hourly Wage: $%.2f\n", hourlyWage);
        System.out.printf("Gross Salary: $%.2f\n", grossSalary);
        System.out.printf("Taxes Deducted: $%.2f\n", tax);
        System.out.printf("Net Salary: $%.2f\n", netSalary);
    }
}