package student_igors_bartkevics.lesson_3.homeworks.day_6;

class Product {

    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public double actualPrice() {
        return this.regularPrice - this.regularPrice * this.discount;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void printInformation() {

        String name = this.name;
        System.out.println("Product name is: " + name);

        String regularPrice = String.format("%.2f", this.regularPrice);
        System.out.println("Product regular price is: " + regularPrice + " EUR");

        System.out.println("Product discount is: " + this.discount * 100 + " %");

        String actualPrice = String.format("%.2f", actualPrice());
        System.out.println("Product actual price is " + actualPrice + " EUR");

    }
}