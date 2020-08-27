package student_igors_bartkevics.lesson_10.homework.level_3.task_8;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.saveTest();
        test.findByTitleTest();
    }

    void saveTest(){
        InMemoryDatabase database = new InMemoryDatabase();
        Product productToSave = new Product("Milk");
        Product productToFail = new Product("Milk");
        database.save(productToSave);
        checkResult(database.getListOfProducts().get(0).equals(productToSave), "Save");
        checkResult(!database.getListOfProducts().get(0).equals(productToFail), "Save fail");
    }

    void findByTitleTest(){
        Database database = new InMemoryDatabase();
        Product product1 = new Product("Milk");
        Product product2 = new Product("Bread");
        Product product3 = new Product("Butter");
        database.save(product1);
        database.save(product2);
        database.save(product3);
        checkResult(database.findByTitle("Bread").equals(product2), "Find by title");
        checkResult(database.findByTitle("Juice") == null, "Find by title negative result");
    }










    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
