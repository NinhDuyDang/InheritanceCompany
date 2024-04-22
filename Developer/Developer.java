package Developer;

import Employee.Employee;

public class Developer extends Employee {

    public String programLanguage;

    public Developer(int id, String name, int age, String programLanguage) {
        super(id, name, age);
        this.programLanguage = programLanguage;

    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programLanguage);
    }

}
