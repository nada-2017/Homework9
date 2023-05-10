public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("book1",45,"Ahmed");
        Movie m1 = new Movie("Avengers",640,"Stan lee");
        MovablePoint mp = new MovablePoint(5,3,1,2);
        System.out.println(b1.toString());
        System.out.println("Book after discount: "+b1.getDiscount());
        System.out.println("_________________");
        System.out.println(m1.toString());
        System.out.println("Movie after discount: "+m1.getDiscount());
        System.out.println("_________________");
        System.out.println(mp.toString());
        mp.moveRight();
        mp.moveDown();
        System.out.println("After moving to right & down: \n"+mp.toString());

    }
}