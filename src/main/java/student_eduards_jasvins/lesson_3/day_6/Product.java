package student_eduards_jasvins.lesson_3.day_6;

public class Product {

    private String name;
    private double regularPrice;
    private double actualPrice;

    public Product(String name) { this.name = name; }

    public double getRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
        return regularPrice;
    }

    public double getActualPrice(double actualPrice) {
        this.actualPrice = regularPrice * actualPrice / 100;
        return actualPrice;
    }

    public void printInformation() {
        System.out.println("Product name is = " + this.name);
        System.out.println("Product regular price is = " + this.regularPrice);
        System.out.println("Product actual price is = " + (this.regularPrice - this.actualPrice));
    }


}
