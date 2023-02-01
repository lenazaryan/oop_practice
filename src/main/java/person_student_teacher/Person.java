package person_student_teacher;
/*
Create a Person class with properties name, age, and gender.
The class should have a constructor that initializes these properties
and a method displayInfo() that prints the properties.
 */

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void displayInfo(){
        System.out.println("student_teacher.Person {\n" +
                "   name = " + name + ",\n" +
                "   age = " + age + ",\n" +
                "   gender = " + gender + "\n}");
    }
}
