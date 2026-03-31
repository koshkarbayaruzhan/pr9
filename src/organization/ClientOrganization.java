package organization;

public class ClientOrganization {
    public static void main(String[] args) {
        Employee e1 = new Employee("Иван", "Разработчик", 1000, false);
        Employee e2 = new Employee("Мария", "Аналитик", 1200, false);
        Employee e3 = new Employee("Пётр", "Фрилансер", 500, true);

        Department devDept = new Department("Разработка");
        devDept.addComponent(e1);
        devDept.addComponent(e3);

        Department itDept = new Department("IT");
        itDept.addComponent(devDept);
        itDept.addComponent(e2);

        itDept.showDetails();
        System.out.println("Общий бюджет отдела: " + itDept.getBudget());
        System.out.println("Общее количество сотрудников: " + itDept.getEmployeeCount());
    }
}
