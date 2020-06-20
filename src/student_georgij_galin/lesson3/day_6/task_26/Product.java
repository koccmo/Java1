package student_georgij_galin.lesson3.day_6.task_26;

public class Product {
    private final String name;
    private double regularPrice;
    private double actualPrice;

    public Product(String name) {
        this.name = name;
    }

    public void getRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void getActualPrice(double actualPrice) {
        this.actualPrice = regularPrice * actualPrice / 100;
    }

    public void printInformation() {
        System.out.println("Product name : " + name);
        System.out.println("Product regular price : " + regularPrice);
        System.out.println("Product price with discount : " + (regularPrice - actualPrice));
    }
}