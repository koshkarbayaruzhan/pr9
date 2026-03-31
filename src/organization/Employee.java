package organization;

public class Employee extends OrganizationComponent {
    private String position;
    private double salary;
    private boolean isContractor;

    public Employee(String name, String position, double salary, boolean isContractor) {
        super(name);
        this.position = position;
        this.salary = salary;
        this.isContractor = isContractor;
    }

    @Override
    public void showDetails() {
        System.out.println(name + " - " + position + " - Зарплата: " + salary + (isContractor ? " (Контракт)" : ""));
    }

    @Override
    public double getBudget() {
        return isContractor ? 0 : salary;
    }

    @Override
    public int getEmployeeCount() {
        return 1;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
