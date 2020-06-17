package student_dmitrijs_jasvins.lesson_3.day_6.task_26;

public class ProductDemo {
    public static void main(String[] args) {
        Product myProduct = new Product("Computer");
        myProduct.getRegularPrice(350);
        myProduct.getActualPrice(15);
        myProduct.printInformation();
    }
}
