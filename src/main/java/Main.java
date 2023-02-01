import person_student_teacher.Person;
import person_student_teacher.Student;
import person_student_teacher.Teacher;
import restaurant.Restaurant;

import javax.xml.stream.Location;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Lena", 29, "female");
        person1.displayInfo();
        Student student1 = new Student(1, person1, "java");
        student1.addCourse("java");
        student1.displayInfo();
        Person person2 = new Person("Alan", 47, "female");
        Teacher teacher = new Teacher(1, person2);
        teacher.addSubject("java");
        teacher.displayInfo();

        BankAccount account = new BankAccount("lena");
        account.displayBalance();
        account.deposit(392789);
        account.withdraw(9);
        account.displayBalance();

        Car car = new Car("Volkswagen", "Beetle", "Java Green", 1965);
        car.displayInfo();
        car.drive();
        car.stop();

        Rectangle rectangle = new Rectangle(23.5, 34.8);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Restaurant restaurant = new Restaurant("Genacvale", 40.19569526794534, 44.48784411263304);
        restaurant.addMenuItem("Khinkali", 5000);
        restaurant.addReview("Lena", "aksjc ascklm aiowquitqidf!!");
        restaurant.displayReviews();
        restaurant.displayMenu();

        Computer computer = new Computer("Apple", "MacBook Pro", 2020, 8, 16, 250.69);
        computer.displaySpecifications();
        computer.runProgram("salcnaks");

        Library library = new Library("Avetik Isahakyan Central Library", 40.17824104622337, 44.516481136940364);
        library.addBook("Book");
        library.addBook("Book2");
        library.addBook("Book3");
        library.displayBooks();
        library.checkOutBook("Book3");
        library.checkOutBook("Book4");
        library.displayBooks();
    }

}
