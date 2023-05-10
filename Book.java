public class Book extends Product{
    private String author;

    public Book() {
        this.author = "Author";
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    double getDiscount() {
        return getPrice() - (getPrice()*20/100);
    }

    @Override
    public String toString() {
        return "Book: " +getName()+
                "\nAuthor: " + author + "\nPrice: "+getPrice();
    }
}
