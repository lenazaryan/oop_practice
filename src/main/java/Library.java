import restaurant.Location;

import java.util.ArrayList;

/*
Create a Library class with properties name, location, and books.
The class should have a constructor that initializes these properties and methods
addBook(String book) to add a book to the books list, checkOutBook(String book) to remove
a book from the books list and displayBooks() to list all the books in the library.
 */
public class Library {
    String name;
    Location location;
    ArrayList<String> books;

    public Library (String name, double latitude, double longitude){
        this.name = name;
        this.location = new Location(latitude, longitude);
        this.books = new ArrayList<>();
    }

    public ArrayList<String> getBooks(){
        return books;
    }
    public void addBook(String book){
        books.add(book);
    }
    public void checkOutBook(String book){
        if(books.contains(book)){
        books.remove(book);
        }else System.out.println(book + " cannot be removed, because it is not found");
    }
    public void displayBooks(){
        System.out.println("Books " + getBooks());
    }
}
