package student_volodya_danilin.lesson_3.day_6;

public class Product {

    private String name;
    private double regularPrice;
    private double discount;
    private double actualPrice;

        Product(String name, double regularPrice, double discount){
            this.name = name;
            this.regularPrice = regularPrice;
            this.discount = discount;
        }

    public void actualPrice(){
        actualPrice = regularPrice - (regularPrice * discount / 100);
    }

    public void printInformation(){
            System.out.println("Product name: " + name);
            System.out.println("Usual price is " + regularPrice);
            System.out.println("Discount is " + discount);
            System.out.println("Actual price is " + actualPrice);
    }
}
