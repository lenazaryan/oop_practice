package person_student_teacher;

import java.util.ArrayList;
import java.util.List;
/*
Create a Student class that inherits from the student_teacher.Person class.
The class should have additional properties studentId and courses,
and a method addCourse(String course) that adds a course to the courses list.
 */
public class Student extends Person{

     private int studentId;

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    private List<String> courses = new ArrayList<>();

    public Student(int studentId, Person person, String courses){
        super(person.getName(), person.getAge(), person.getGender());
        this.studentId = studentId;
    }

    public void addCourse(String course){
        courses.add(course);
    }

    @Override
    public void displayInfo() {
        System.out.println("student_teacher.Student {\n" +
                "   studentId = " + studentId + ",\n" +
                "   name = " + super.getName() + ",\n" +
                "   age = " + this.getAge() + ",\n" +
                "   gender = " + this.getGender() + ",\n" +
                "   course = " + this.courses +
                "\n}");
    }
}
