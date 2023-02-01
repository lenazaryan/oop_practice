/*
Create a Computer class with properties brand, model, year, cpu, ram and storage.
The class should have a constructor that initializes these properties and methods
displaySpecifications() that print all the computer specifications and
runProgram(String programName) that simulates the computer running a program.
 */
public class Computer {
    String brand;
    String model;
    int year;
    int cpu;
    int ram;
    double storage;

    public Computer(String brand, String model, int year, int cpu, int ram, double storage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    public void runProgram(String programName){
        System.out.println(programName + " is running");
    }
    public void displaySpecifications() {
        System.out.println("Computer {\n" +
                "   brand: " + brand + ",\n" +
                "   model: " + model + ",\n" +
                "   year: " + year + ",\n" +
                "   cpu: " + cpu + ",\n" +
                "   ram: " + ram + ",\n" +
                "   storage: " + storage + ",\n}");
    }
}

