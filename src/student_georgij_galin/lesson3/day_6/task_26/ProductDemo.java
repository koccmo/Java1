package student_georgij_galin.lesson3.day_6.task_26;


public class ProductDemo {
    public static void main(String[] args) {
        Product myProduct = new Product("Television");
        myProduct.getRegularPrice(600);
        myProduct.getActualPrice(120);
        myProduct.printInformation();
    }
}