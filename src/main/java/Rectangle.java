/*
Create a Rectangle class with properties length and width.
The class should have a constructor that initializes these properties and methods
calculateArea() and calculatePerimeter() that return the area and perimeter of the rectangle.
 */
public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea(){
        double area = width*length;
        System.out.println("Area of rectangle = " + area);
        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 2*(length*width);
        System.out.println("Perimeter of rectangle = " + perimeter);
        return perimeter;
    }


}
