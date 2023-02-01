package restaurant;

public class Review {
    String author;
    String textReview;

    public Review(String author, String text) {
        this.author = author;
        this.textReview = text;
    }

    public String toString(){
        return "Review {\n" +
                "   author: " + author + "\n" +
                "   review: " + textReview + "\n}";
    }
}
