import java.util.Scanner; // Import Scanner class to read user input

public class PayrollCalculator {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name and store it
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask the user for their hourly wage and store it as a double
        System.out.print("Enter your hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        // Ask the user for the number of hours worked and store it as an integer
        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();

        // Close the scanner to avoid resource leaks
        scanner.close();

        // Calculate the gross salary (hourly wage multiplied by hours worked)
        double grossSalary = hourlyWage * hoursWorked;

        // Calculate taxes (20% of gross salary)
        double tax = grossSalary * 0.20;

        // Calculate net salary after taxes
        double netSalary = grossSalary - tax;

        // Print the payroll summary
        System.out.println("\nPayroll Summary for " + name);
        System.out.println("-----------------------------------");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Hourly Wage: $%.2f\n", hourlyWage);
        System.out.printf("Gross Salary: $%.2f\n", grossSalary);
        System.out.printf("Taxes Deducted: $%.2f\n", tax);
        System.out.printf("Net Salary: $%.2f\n", netSalary);
    }
}