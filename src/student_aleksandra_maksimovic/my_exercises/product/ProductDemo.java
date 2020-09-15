package student_aleksandra_maksimovic.my_exercises.product;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("xolodos");
        product.setDiscount(0.10);
        product.setRegularPrice(200.0);
        product.actualPrice();
        product.printInformation();

    }
}
