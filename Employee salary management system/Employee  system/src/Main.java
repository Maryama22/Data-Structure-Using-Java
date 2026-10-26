public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee(101, "Aisha Ali", "IT", 800, 350),
                new PartTimeEmployee(102, "Maryan Abdi", "Manager", 40, 9),
                new Manager(103, "Mohamed Abshir", "Admin", 1200, 300)
        };

        System.out.println("===== EMPLOYEE SALARY REPORT =====\n");
        for (Employee e : employees) {
            e.display();
        }
    }
}