package Assignment8;

import java.util.*;
import java.util.stream.Collectors;

interface EmployeeFilter{
    void filter(EmployeeManagementSystem ems);
}

class Employee{
    String empName;
    int salary;
    int yearsOfExp;
    String dept;

    Employee(String empName,String dept,int yearsOfExp,int salaray){
        this.empName=empName;
        this.salary =salaray;
        this.dept=dept;
        this.yearsOfExp=yearsOfExp;
    }
}

class EmployeeManagementSystem{
    static List<Employee> empList=new ArrayList<>();
    private static EmployeeManagementSystem single_instance = null;

    private EmployeeManagementSystem(){}
    public static synchronized EmployeeManagementSystem getInstance()
    {
        if (single_instance == null)
            single_instance = new EmployeeManagementSystem();

        return single_instance;
    }
    public void addEmployee(Employee emp){
        empList.add(emp);
    }

    public List<Employee> getListEmployee(){
        return empList;
    }
}
public class Fifth {
    public static void main(String[] args) {
        EmployeeManagementSystem ems=EmployeeManagementSystem.getInstance();
        ems.addEmployee(new Employee("Maan","BackendJava",4,300000));
        ems.addEmployee(new Employee("Aditya","BackendJava",3,400000));
        ems.addEmployee(new Employee("Tufail","BackendJava",3,300000));
        ems.addEmployee(new Employee("Jeet","FrontEnd",4,400000));
        ems.addEmployee(new Employee("Jay","FrontEnd",5,300000));


        EmployeeFilter filterByDept=new EmployeeFilter() {
            @Override
            public void filter(EmployeeManagementSystem ems) {
                List<Employee> lstEmp=ems.getListEmployee();
                Map<String,List<String>> hs=lstEmp.stream().map(n->n.dept).distinct().collect(Collectors.toMap(entry->entry+" ",entry->lstEmp.stream().filter(obj-> Objects.equals(obj.dept, entry)).map(n->n.empName).collect(Collectors.toList())));
                System.out.println("FilterByDepartment :- "+hs);
            }
        };
        System.out.println();
        filterByDept.filter(ems);

        EmployeeFilter filterBySalaryRange=new EmployeeFilter() {
            @Override
            public void filter(EmployeeManagementSystem ems) {
                List<Employee> lstEmp=ems.getListEmployee();
                Map<String,List<String>> hs=lstEmp.stream().map(n->n.salary).distinct().collect(Collectors.toMap(entry->"Salary:-"+entry+"rs ", entry->lstEmp.stream().filter(obj-> Objects.equals(obj.salary, entry)).map(n->n.empName).collect(Collectors.toList())));
                System.out.println("Filter by salary range :- "+hs);
            }
        };
        System.out.println();
        filterBySalaryRange.filter(ems);

        EmployeeFilter filterByYearsOfExp=new EmployeeFilter() {
            @Override
            public void filter(EmployeeManagementSystem ems) {
                List<Employee> lstEmp=ems.getListEmployee();
                Map<String,List<String>> hs=lstEmp.stream().map(n->n.yearsOfExp).distinct().collect(Collectors.toMap(entry->entry+" YearsExperience ",entry->lstEmp.stream().filter(obj-> Objects.equals(obj.yearsOfExp, entry)).map(n->n.empName).collect(Collectors.toList())));
                System.out.println("Filter by years of experience :- "+hs);
            }
        };
        System.out.println();
        filterByYearsOfExp.filter(ems);
    }
}
