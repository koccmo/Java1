package student_georgij_galin.lesson3.day_6.task_26;

public class Product {
    private String name;
    private double regularPrice;
    private double actualPrice;

    public Product(String name) {
        this.name = name;
    }

    public double getRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
        return regularPrice;
    }

    public double getActualPrice(double actualPrice) {
        this.actualPrice = regularPrice * actualPrice / 100;
        return actualPrice;
    }

    public void printInformation() {
        System.out.println("Product name : " + name);
        System.out.println("Product regular price : " + regularPrice);
        System.out.println("Product price with discount : " + (regularPrice - actualPrice));
    }
}