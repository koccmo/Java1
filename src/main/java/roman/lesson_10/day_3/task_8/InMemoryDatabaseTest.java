package roman.lesson_10.day_3.task_8;

public class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.ifSaveProduct();
        test.findByTitleTest();
    }

    Product nivea = new Product("Nivea");
    Product cola = new Product("Coca-Cola");

    InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

    public void ifSaveProduct() {
        inMemoryDatabase.save(nivea);
        checkResult(inMemoryDatabase.getProductList().get(0).equals(nivea), "If save Product");
    }

    public void findByTitleTest() {
        checkResult(inMemoryDatabase.findByTitle("Adidas") == null,
                "Find by Title");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " Test is OK!");
        } else {
            System.out.println(nameOfTest + " Test is FAIL!");
        }
    }
}
