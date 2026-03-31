package organization;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void addComponent(OrganizationComponent component) {
        components.add(component);
    }

    public void removeComponent(OrganizationComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Отдел: " + name);
        for(OrganizationComponent c : components) {
            c.showDetails();
        }
    }

    @Override
    public double getBudget() {
        double budget = 0;
        for(OrganizationComponent c : components) {
            budget += c.getBudget();
        }
        return budget;
    }

    @Override
    public int getEmployeeCount() {
        int count = 0;
        for(OrganizationComponent c : components) {
            count += c.getEmployeeCount();
        }
        return count;
    }
}
