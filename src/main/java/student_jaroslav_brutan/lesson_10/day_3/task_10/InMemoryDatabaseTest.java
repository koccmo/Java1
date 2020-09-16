package student_jaroslav_brutan.lesson_10.day_3.task_10;

import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.saveTest();
        test.findByTitleTestOK();
        test.findByTitleTestFail();
    }

    void saveTest(){
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Coffee");
        inMemoryDatabase.save(product);
        boolean result = inMemoryDatabase.getProductList().get(0).equals(product);
        if (result){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    void findByTitleTestOK(){
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Coffee");
        Product product2 = new Product("Milk");
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        Optional<Product> result = inMemoryDatabase.findByTitle("Coffee");
        if (result.isPresent()){
            result.equals(product1);
            System.out.println("Test - OK!");
        } else{
            System.out.println("Test - FAIL!");
        }
    }

    void findByTitleTestFail(){
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Coffee");
        Product product2 = new Product("Milk");
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);

        boolean result = inMemoryDatabase.findByTitle("Cat").isPresent();
        if (result){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }

    }

}
