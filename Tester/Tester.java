package Tester;

import Employee.Employee;

public class Tester  extends Employee {
    private String testTools;

    public Tester(int id, String name, int age, String testTools) {
        super(id, name, age);
        this.testTools = testTools;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Test Tools: " + testTools);
    }
}
