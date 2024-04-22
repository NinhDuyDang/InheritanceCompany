package Leader;

import Employee.Employee;

public class Leader extends Employee {

    public int teamSize;
    private static final double BASE_SALARY = 10000000; // Lương cơ bản

    public Leader(int id, String name, int age, int teamSize) {
        super(id, name, age);
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Bonus: " + bonus());
    }

    public double bonus() {
        if (teamSize > 10) {
            return BASE_SALARY * 0.5; // 50% bonus
        } else {
            return BASE_SALARY * 0.1; // 10% bonus
        }
    }
}
