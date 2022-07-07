package roman.lesson_10.day_3.task_9;

import java.util.Optional;

public class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.saveTest();
        test.positiveToFind();
        test.negativeFindByTitle();
    }

    public void saveTest() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product xiaomi = new Product("Xiaomi");
        inMemoryDatabase.save(xiaomi);
        checkResult(inMemoryDatabase.getProductList().get(0).equals(xiaomi),
                "Save in DataBase");
    }

    public void positiveToFind() {
        Product apple = new Product("Apple");
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        inMemoryDatabase.save(apple);
        Optional<Product> result = inMemoryDatabase.findByTitle("Apple");
        boolean condition = false;
        if(result.isPresent()) {
            condition = result.get().equals(apple);
        }
        checkResult(condition,"Positive find by Title");
    }

    public void negativeFindByTitle() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product dell = new Product("Dell");
        Product sony = new Product("Sony");
        inMemoryDatabase.save(dell);
        inMemoryDatabase.save(sony);
        boolean condition = inMemoryDatabase.findByTitle("Sharp").isPresent();
        checkResult(!condition, "Negative find by Title");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test is OK!");
        } else {
            System.out.println(nameOfTest + " Test is FAIL!");
        }
    }
}
