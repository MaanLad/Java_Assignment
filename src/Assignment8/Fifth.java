package Assignment8;

import java.util.ArrayList;
import java.util.List;

interface EmployeeFilter{
    boolean filter(EmployeeManagementSystem ems);
}

class Employee{
    String empName;
    int salaray;
    int yearsOfExp;
    String dept;

    Employee(String empName,String dept,int yearsOfExp,int salaray){
        this.empName=empName;
        this.salaray=salaray;
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
        ems.addEmployee(new Employee("Maan","BackendJava",300000,5));
        ems.addEmployee(new Employee("Aditya","BackendJava",300000,5));
        ems.addEmployee(new Employee("Tufail","BackendJava",300000,5));
        ems.addEmployee(new Employee("Jeet","FrontEnd",300000,5));
        ems.addEmployee(new Employee("Jay","FrontEnd",300000,5));


        EmployeeFilter filterByDept=new EmployeeFilter() {
            @Override
            public boolean filter(EmployeeManagementSystem ems) {
                List<Employee> lstEmp=ems.getListEmployee();
                return false;
            }
        };


        filterByDept.filter(ems);
    }
}
