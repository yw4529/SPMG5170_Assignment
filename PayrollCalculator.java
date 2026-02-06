import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();

        scanner.close();

        double grossSalary = hourlyWage * hoursWorked;
        double tax = grossSalary * 0.20;
        double netSalary = grossSalary - tax;

        System.out.println("\nPayroll Summary for " + name);
        System.out.println("-----------------------------------");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Hourly Wage: $%.2f\n", hourlyWage);
        System.out.printf("Gross Salary: $%.2f\n", grossSalary);
        System.out.printf("Taxes Deducted: $%.2f\n", tax);
        System.out.printf("Net Salary: $%.2f\n", netSalary);
    }
}
