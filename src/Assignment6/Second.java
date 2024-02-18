package Assignment6;
import java.util.*;


class Student {
    private static final Map<String, Student> studentInstances = new HashMap<>();
    public static List<Student> studentList = new ArrayList<Student>();

    String name;
    int age;
    String grade;

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static void addStudentRecord(Student obj) {
        studentList.add(obj);
        studentInstances.put(obj.name, obj);
    }

    public static OptionalDouble getAverageAge() {
        return studentList.stream().map(s -> s.age).mapToDouble(Integer::doubleValue).average();
    }

    public static Student getInstance(String name) {
        if (studentInstances.containsKey(name)) {
            // Return existing instance if accNo already exists
            return studentInstances.get(name);
        } else {
            // Create a new instance if accNo doesn't exist
            System.out.println("Student with name "+name+" doesn't exists in the record");
            Student newStudentInstance = new Student(name);
            studentInstances.put(name, newStudentInstance);
            return newStudentInstance;
        }
    }

    public static void getSortedList(){
        System.out.println("SORTED LIST OF ALL STUDENTS BY THEIR GRADE");
        List<Student> newStudentList= studentList.stream().sorted(Comparator.comparing(student -> student.grade)).toList();
        newStudentList.forEach(student->{
            System.out.println("Name :- "+student.name+"  Grade :- "+student.grade);
        });
    }

    public void printDetail(){
        System.out.println("THE STUDENTS DATA");
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Grade : "+this.grade);
    }

}

public class Second {
    public static void main(String[] args) {
        Student std1= new Student("Maan",18,"AB");
        Student std2= new Student("Max",17,"BC");
        Student std3= new Student("Arson",18,"CC");
        Student std4= new Student("Jin",16,"BA");

        //Adding new student instances
        Student.addStudentRecord(std1);
        Student.addStudentRecord(std2);
        Student.addStudentRecord(std3);
        Student.addStudentRecord(std4);

        //Average age method of class
        System.out.println("Average age :- "+Student.getAverageAge().getAsDouble());

        //Find student by their name
        System.out.println();
        Student fStudent=Student.getInstance("Maan");
        fStudent.printDetail();

        //Sorted student by their grade
        System.out.println();
        Student.getSortedList();
    }
}
