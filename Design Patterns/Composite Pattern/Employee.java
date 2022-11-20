import java.util.ArrayList;

public class Employee{
    private String name;
    private String department;
    private int salary;
    private ArrayList<Employee> subordinates;

    public Employee(String name, String dept, int salary){
        this.name = name;
        this.department = dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void addSubordinate(Employee subordinate){
        subordinates.add(subordinate);
    }

    public void remove(Employee subordinate){
        subordinates.remove(subordinate);
    }

    public ArrayList<Employee> getSubordinates(){
        return subordinates;
    }

    public void getEmployeeInfo(){
        System.out.println("Employee: Name: " + name + ", department: " + department + ", salary: " + salary);
    }
}