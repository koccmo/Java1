package student_jekaterina_loseva.lesson_3.day_6.task_26;

public class ProductDemo {

    public static void main(String[] args) {

        Product newProduct = new Product("Coffee");
        newProduct.regularPrice = 6.00;
        newProduct.discount = 20;
        newProduct.printInformation();
    }

}
