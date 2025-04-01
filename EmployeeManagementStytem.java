import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<employee> employees = new ArrayList<>();
        
        employees.add(new employee(101, "John Doe", 75000.00));
        employees.add(new employee(102, "Jane Smith", 82000.50));
        employees.add(new employee(103, "Robert Johnson", 68000.75));

        System.out.println("Employee Details:");
        System.out.println("=================");
        for (employee emp : employees) {
            emp.displayDetails();
        }
    }
}
class employee {
    private int id;
    private String name;
    private double salary;

    public employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + String.format("%.2f", salary));
        System.out.println("----------------------");
    }

    // Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
}
