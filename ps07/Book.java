package ps07;

import java.util.Arrays;

public class Book {
    private String name;
    private Author [] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        //TODO change [] in Arrays.toString(authors) to {} (Don't know how to do that)
        return "Book[" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }

    public String getAuthorNames (){
        String [] nameString = new String[authors.length];
        for (int i = 0; i < authors.length; i++){
            nameString[i] = authors[i].getName();
        }
        // TODO remove square brackets
        return Arrays.toString(nameString);
    }

}
