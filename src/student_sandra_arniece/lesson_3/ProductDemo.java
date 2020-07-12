package student_sandra_arniece.lesson_3;

public class ProductDemo {
    public static void main(String[] args) {
        Product productX = new Product("X");
        productX.setRegularPrice(999.99);
        productX.setDiscount(10);
        productX.printInformation();
    }
}
