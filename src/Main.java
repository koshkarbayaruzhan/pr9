import organization.*;

public class Main {
    public static void main(String[] args) {
        // Создаем сотрудников
        Employee e1 = new Employee("Иван", "Разработчик", 1000, false);
        Employee e2 = new Employee("Мария", "Аналитик", 1200, false);
        Employee e3 = new Employee("Пётр", "Фрилансер", 500, true);

        // Создаем отделы и добавляем сотрудников
        Department devDept = new Department("Разработка");
        devDept.addComponent(e1);
        devDept.addComponent(e3);

        Department itDept = new Department("IT");
        itDept.addComponent(devDept);
        itDept.addComponent(e2);

        // Показываем структуру
        itDept.showDetails();

        // Общий бюджет и количество сотрудников
        System.out.println("Общий бюджет отдела: " + itDept.getBudget());
        System.out.println("Общее количество сотрудников: " + itDept.getEmployeeCount());
    }
}
