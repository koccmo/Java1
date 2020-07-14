package student_vladislav_zagrebin.lesson_3.homeWork.day_6.Task_26;

public class Product {

    private String name;
    public double regularPrice;
    public double discount;

    public Product(String productName) {
        this.name = productName;
    }

    public double discountedPrice() {
        return this.regularPrice - this.regularPrice * discount / 100;
    }

    public void printInformation() {
        System.out.println("Product name - " + this.name
                + ". Regular price - " + this.regularPrice
                + ". Discount - " + this.discount + " %"
                + ". Price with discount - " + discountedPrice());
    }
}
