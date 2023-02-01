package restaurant;

import java.util.ArrayList;

/*
Create a restaurant.Restaurant class with properties name, location, menu, and reviews.
The class should have a constructor that initializes these properties and methods
addMenuItem(String item) to add a menu item, addReview(String review) to add a review
and displayReviews() to list all the reviews for the restaurant.
 */
public class Restaurant {
    String restaurantName;
    Location location;
    ArrayList<MenuItem> menu;

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    ArrayList<Review> reviews;

    public Restaurant(String name, double latitude, double longitude){
        this.restaurantName = name;
        this.location = new Location(latitude, longitude);
        this.menu = new ArrayList<MenuItem>();
        this.reviews = new ArrayList<Review>();
    }


    public void addMenuItem(String name, double price){
        menu.add(new MenuItem(name, price));
    }

    public void addReview(String author, String text){
        reviews.add(new Review(author, text));
    }

    public void displayReviews(){
        System.out.println("Reviews {\n" + getReviews() + "\n}");
    }

    public void displayMenu(){
        System.out.println("Menu {\n" + getMenu() + "\n}");
    }


}
