class Employee {
     String  name, department;
     int id;
    double basicSalary;

    Employee(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    double calculateSalary()
    { return basicSalary; }

    String getCategory()
    { return "Employee"; }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + getCategory());
        System.out.printf("Monthly Salary: $%.2f%n%n", calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    double allowance;

    FullTimeEmployee(int id, String name, String dept, double basic, double allowance) {
        super(id, name, dept, basic);
        this.allowance = allowance;
    }

    @Override
    double calculateSalary()
    { return basicSalary + allowance; }

    @Override
    String getCategory()
    { return "Full-Time Employee"; }
}

class PartTimeEmployee extends Employee {
    private double hoursWorked, hourlyRate;

    PartTimeEmployee(int  id, String name, String dept, double hours, double rate) {
        super(id, name, dept, 0);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    @Override
    double calculateSalary()
    { return hoursWorked * hourlyRate; }

    @Override
    String getCategory() { return "Part-Time Employee"; }
}

class Manager extends Employee {
     double bonus;

    Manager(int  id, String name, String dept, double basic, double bonus) {
        super(id, name, dept, basic);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary()
    { return basicSalary + bonus; }

    @Override
    String getCategory()
    { return "Manager"; }
}

