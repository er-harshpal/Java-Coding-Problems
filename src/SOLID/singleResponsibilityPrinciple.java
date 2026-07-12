package SOLID;

public class singleResponsibilityPrinciple {

    public static void main(String[] args){
        // Create Employee object
        Employee emp =new Employee("Harsh");

        // Create service objects
        SalaryService salaryService = new SalaryService();

        // Call methods
        salaryService.calculateSalary(emp);
    }
}

class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }
}

class SalaryService {
    public void calculateSalary(Employee emp){
        System.out.println("Calculating Salary");
    }
}
