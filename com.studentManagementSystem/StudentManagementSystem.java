import java.util.ArrayList;
import java.util.List;

class Student{
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class StudentManagementSystem {
    List<Student> student;

    public StudentManagementSystem() {
        this.student = new ArrayList<Student>();
    }

    public void addStudent(String name, int age, int grade){
        Student students = new Student(name,age,grade);

        student.add(students);
    }
}