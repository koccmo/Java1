package student_volodya_danilin.lesson_10.level_3.Task_10;

import java.util.Optional;

public class DatabaseImplDemo {

    public static void main(String[] args) {

        Optional<Product> productTest; // будем помещать результаты findByTitle сюда

        System.out.println("Starting new tests ... ");

        System.out.print("Creating Product 'Pepsi' ... ");
        Product pepsi = new Product("Pepsi");
        System.out.println("OK");

        System.out.print("Creating new DatabaseImpl object ... ");
        DatabaseImpl data = new DatabaseImpl();
        System.out.println("OK");

        System.out.print("Saving Pepsi to database ... ");
        data.save(pepsi);
        System.out.println("OK");

        System.out.println("\nTesting findByTitle method ... ");

        System.out.println("Searching for Product that exists in database ...");
        productTest = data.findByTitle("Pepsi");
        if (productTest.equals(Optional.of(pepsi))) {
            System.out.println("Pepsi found! \nTest OK");
        }
        else {
            System.out.println("Pepsi not found! \nTest FAIL");
        }

        System.out.println("\nSearching for non-existent Product ...");
        productTest = data.findByTitle("BURGER BURGER 5555");
        if (productTest.equals(Optional.empty())) {
            System.out.println("Product not found, got empty Optional \nTest OK");
        }
        else {
            System.out.println("Test FAIL");
        }
    }
}
