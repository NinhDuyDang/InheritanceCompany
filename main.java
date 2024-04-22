import java.util.ArrayList;
import java.util.Scanner;

import Developer.Developer;
import Employee.Employee;
import Leader.Leader;
import Tester.Tester;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println("Enter number of employees:");
        int numOfEmployees = scanner.nextInt();

        for (int i = 0; i < numOfEmployees; i++) {
            System.out.println("Enter employee type (1 for Developer, 2 for Tester, 3 for Leader):");
            int employeeType = scanner.nextInt();

            System.out.println("Enter ID:");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Age:");
            int age = scanner.nextInt();
            scanner.nextLine();

            switch (employeeType) {
                case 1:
                    System.out.println("Enter Programming Language:");
                    String programmingLanguage = scanner.nextLine();
                    employees.add(new Developer(id, name, age, programmingLanguage));
                    break;
                case 2:
                    System.out.println("Enter Test Tools:");
                    String testTools = scanner.nextLine();
                    employees.add(new Tester(id, name, age, testTools));
                    break;
                case 3:
                    System.out.println("Enter Team Size:");
                    int teamSize = scanner.nextInt();
                    employees.add(new Leader(id, name, age, teamSize));
                    break;
                default:
                    System.out.println("Invalid employee type!");
            }
        }

        System.out.println("Employee Information:");
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println();
        }

        // Display Developers with Java programming language
        System.out.println("Developers with Java Programming Language:");
        for (Employee emp : employees) {
            if (emp instanceof Developer) {
                Developer dev = (Developer) emp;
                if (dev.programLanguage.equalsIgnoreCase("Java")) {
                    dev.displayInfo();
                }
            }
        }

        // Find Leader with team size > 10
        System.out.println("Leaders with Team Size > 10:");
        for (Employee emp : employees) {
            if (emp instanceof Leader) {
                Leader leader = (Leader) emp;
                if (leader.teamSize > 10) {
                    leader.displayInfo();
                }
            }
        }
    }

}
