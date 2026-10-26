## Project Structure


Assignment1-Employee/
  Employee.java
  Main.java
  Screenshots/
    employee-output.png
Assignment2-Hospital/
  MedicalService.java
  Main.java
  Screenshots/
    hospital-output.png


---

## Assignment 1: Employee Salary Management System

*Concepts:* Inheritance and Polymorphism

A company in Mogadishu employs full-time, part-time, and manager employees. Each category has a different salary formula.

### Class Structure

| Class | Type | Description |
|---|---|---|
| Employee | Superclass | id, name, department, basicSalary, calculateSalary() |
| FullTimeEmployee | Subclass | Adds allowance |
| PartTimeEmployee | Subclass | Adds hoursWorked and hourlyRate |
| Manager | Subclass | Adds bonus |

### Salary Rules

- *Full-Time:* basicSalary + allowance
- *Part-Time:* hoursWorked × hourlyRate
- *Manager:* basicSalary + bonus

### OOP Concepts Demonstrated

- *Inheritance:* extends and super(...)
- *Method overriding:* @Override calculateSalary()
- *Polymorphism:* different objects stored in an Employee[] array, each calling its own calculateSalary()

### Output



![Employee Salary Report](Assignment1-Employee/Screenshots/employee-output.png)




===== EMPLOYEE SALARY REPORT =====

Employee ID: 101
Name: Aisha Ali
Category: Full-Time Employee
Monthly Salary: $1150.00

Employee ID: 102
Name:  Maryan Abdi
Category: Part-Time Employee
Monthly Salary: $360.00

Employee ID:103
Name: Mohamed Abshir
Category: Manager
Monthly Salary: $1500.00


### Questions

*1. Identify the superclass and subclasses.*
Superclass: Employee. Subclasses: FullTimeEmployee, PartTimeEmployee, Manager.

*2. Explain how inheritance reduces code duplication.*

Shared fields (id, name, department, basicSalary) and the display() method are written once in Employee. Subclasses inherit them and only define what is unique to them.

*3. Identify the method that demonstrates polymorphism.*

calculateSalary(). The same call on an Employee reference runs a different version depending on the real object type.

*4. Explain why @Override is used.*

It tells the compiler the method replaces a superclass method, so mistakes in the method name or parameters are caught at compile time, and it makes the code easier to read.

---
