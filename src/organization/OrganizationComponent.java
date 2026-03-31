package organization;

public abstract class OrganizationComponent {
    protected String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public abstract void showDetails();
    public abstract double getBudget();
    public abstract int getEmployeeCount();
}
