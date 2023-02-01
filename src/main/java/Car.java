/*
Create a Car class with properties make, model, year, and color.
The class should have a constructor that initializes these
properties and methods drive(), stop(), and displayInfo().
 */
public class Car {
    String make;
    String model;
    String color;
    int year;

    public Car(String make, String model, String color, int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void drive(){
        System.out.println("Car is driving");
    }

    public void stop(){
        System.out.println("Car stopped");
    }

    public void displayInfo(){
        System.out.println("Car {\n" +
                "   make: " + make + ",\n" +
                "   model: " + model + ",\n" +
                "   color: " + color + ",\n" +
                "   year: " + year + "\n}");
    }
}
