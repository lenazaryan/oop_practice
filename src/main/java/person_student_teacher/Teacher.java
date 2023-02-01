package person_student_teacher;
import java.util.ArrayList;
/*
Create a Teacher class that inherits from the student_teacher.Person class.
The class should have additional properties employeeId and subjects,
and a method addSubject(String subject) that adds a subject to the subjects list.
 */
public class Teacher extends Person{

    int employeeId;
    ArrayList<String> subjects = new ArrayList<>();

    public Teacher(int employeeId, Person person) {
        super(person.getName(), person.getAge(), person.getGender());
        this.employeeId = employeeId;
    }

    public ArrayList<String> addSubject(String subject){
        subjects.add(subject);
        return subjects;
    }

    @Override
    public void displayInfo() {
        System.out.println("student_teacher.Teacher {\n " +
                "  employeeId = " + employeeId + ",\n" +
                "   name = " + getName() + ",\n" +
                "   age = " + getAge() + ",\n" +
                "   gender = " + getAge() + ",\n" +
                "   subjects = " + subjects + "\n}");
    }
}
