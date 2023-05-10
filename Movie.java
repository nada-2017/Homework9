public class Movie extends Product{
    private String director;

    public Movie() {
        this.director = "Director";
    }

    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    double getDiscount() {
        return getPrice() - (getPrice()*40/100);
    }
    public String toString() {
        return "Book: " +getName()+
                "\nDirector: " + director + "\nPrice: "+getPrice();
    }
}
