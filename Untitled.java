import java.util.Scanner;


public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the employee management system!");

        String[] employees = {"John Doe", "Jane Smith", "Bob Johnson", "Mary Brown"};

        for (int i = 0; i < employees.length; i++) {
            System.out.println((i+1) + ". " + employees[i]);
        }

        System.out.print("Enter the number of the employee you want to manage: ");
        int employeeNumber = scanner.nextInt() - 1;

        System.out.println("What do you want to do with " + employees[employeeNumber] + "?");
        System.out.println("1. View employee information");
        System.out.println("2. Update employee information");
        System.out.println("3. Delete employee");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Name: " + employees[employeeNumber]);
                System.out.println("Age: 30");
                System.out.println("Salary: $50,000");
                break;
            case 2:
                System.out.print("Enter the new name: ");
                String newName = scanner.next();
                employees[employeeNumber] = newName;
                System.out.println("Employee information updated successfully!");
                break;
            case 3:
                System.out.println("Are you sure you want to delete " + employees[employeeNumber] + "? (Y/N)");
                String confirmation = scanner.next();
                if (confirmation.equalsIgnoreCase("Y")) {
                    System.arraycopy(employees, employeeNumber + 1, employees, employeeNumber, employees.length - employeeNumber - 1);
                    employees[employees.length - 1] = null;
                    System.out.println("Employee deleted successfully!");
                } else {
                    System.out.println("Operation cancelled.");
                }
                break;
            default:
                System.out.println("Invalid choice, try again.");
                break;
        }
    }

}