package student_alexey_tretyakov.lesson_3.day_6.Task_26;

public class Product {
    private String productName;
    private double regularPrice;
    private double discount;
    private double actualPrice;

    public Product (  String productName, double regularPrice, double discount ) {
        this.productName = productName;
        this.regularPrice = regularPrice;
        this.discount = discount;
        this.actualPrice = setActualPrice();
    }

    public double setRegularPrice( double Price) {
        regularPrice = Price;
        actualPrice = setActualPrice();
        return regularPrice ;
    }
    public double setDiscount( double Discount) {
        discount = Discount;
        actualPrice = setActualPrice();
        return discount;
    }
    public double setActualPrice ()  {
        actualPrice = regularPrice * ( 1 - discount );
        return actualPrice;
    }
    public void printInformation() {
        System.out.println("\n Product name: " + productName
                           + "\n Regular price: " + regularPrice
                           + "\n Discount: " + discount * 100 + "%"
                            + "\n Actual price: " + actualPrice );
    }
}
class ProductDemo {
    public static void main(String[] arg) {
        Product newProduct = new Product ("Bred",1.20, 0.30);
        newProduct.printInformation();
        newProduct.setRegularPrice(1.8);
        newProduct.printInformation();
        newProduct.setDiscount(0.50);
        newProduct.printInformation();

    }
}