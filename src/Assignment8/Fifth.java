package Assignment8;

import java.util.*;

interface EmployeeFilter{
    boolean filter(Employee emp);
}


class FilterByDepartment implements EmployeeFilter{
    String departmentName="";
    FilterByDepartment(String departmentName){
        this.departmentName=departmentName;
    }
    @Override
    public boolean filter(Employee emp) {
        return Objects.equals(emp.dept, departmentName);
    }
}

class FilterByYearsOfExp implements EmployeeFilter{
    int yearsOfExp;
    FilterByYearsOfExp(int yearsOfExp){
        this.yearsOfExp=yearsOfExp;
    }
    @Override
    public boolean filter(Employee emp) {
        return emp.yearsOfExp>=yearsOfExp;
    }
}
class FilterBySalaryRange implements EmployeeFilter{
    int upperRange;
    int lowerRange;

    FilterBySalaryRange(int lowerRange,int upperRange){
        this.upperRange=upperRange;
        this.lowerRange=lowerRange;
    }
    @Override
    public boolean filter(Employee emp) {
        return emp.salary < upperRange && emp.salary > lowerRange;
    }
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
    private final List<Employee> empList=new ArrayList<>();
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

    public void printFilterData(EmployeeFilter filter){
        for (Employee employee : single_instance.empList) {
            if(filter.filter(employee)){
                System.out.println("EmployeeName:-"+employee.empName+", Department:-"+employee.dept+", YearsOfExperience:-"+employee.yearsOfExp+", Salary:-"+employee.salary);
            }
        }
    }

    public List<String> getDistinctDepartment(){
        return empList.stream().map(n->n.dept).distinct().toList();
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

        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("1.Filter By Department");
            System.out.println("2.Filter By YearsOfExperience");
            System.out.println("3.Filter By SalaryRange");
            System.out.println("4.Exit Management System");
            System.out.println();
            System.out.print("Enter your choice of filter :- ");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("\nDistinct Department in system :- "+ems.getDistinctDepartment());
                    System.out.print("Enter DepartmentName From Above List :- ");
                    String department=sc.next();
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("Details Of Employees filtered by given department :- ".toUpperCase());
                    ems.printFilterData(new FilterByDepartment(department));
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.print("\nEnter MinimumYearsOfExperience :- ");
                    int yearsOfExp=sc.nextInt();
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("Details Of Employees filtered by given minimum years of experience :- ".toUpperCase());
                    ems.printFilterData(new FilterByYearsOfExp(yearsOfExp));
                    System.out.println("------------------------------------------------------------------------------");

                    break;
                case 3:
                    System.out.print("\nEnter minimum salary :- ");
                    int lowerRange=sc.nextInt();
                    System.out.print("Enter maximum salary :- ");
                    int upperRange=sc.nextInt();
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("Details Of Employees filtered by given salary range :- ".toUpperCase());
                    ems.printFilterData(new FilterBySalaryRange(lowerRange,upperRange));
                    System.out.println("------------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println();
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("You have exited from the system".toUpperCase());
                    System.out.println("------------------------------------------------------------------------------");
                    return;
            }
            System.out.println();
        }
    }

}