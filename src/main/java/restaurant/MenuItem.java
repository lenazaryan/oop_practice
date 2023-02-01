package restaurant;

public class MenuItem {
    String name;
    double price;

    public MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "Menu Item {\n" +
                "   name: " + name + "\n" +
                "   price: " + price + "\n}";
    }
}
