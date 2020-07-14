package student_eduards_jasvins.lesson_3.day_6;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Car");
        product.getRegularPrice(1999);
        product.getActualPrice(25);
        product.printInformation();
    }

}
