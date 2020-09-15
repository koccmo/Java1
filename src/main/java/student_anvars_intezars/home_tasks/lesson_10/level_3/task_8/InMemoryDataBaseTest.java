package student_anvars_intezars.home_tasks.lesson_10.level_3.task_8;


class InMemoryDataBaseTest {

    public static void main(String[] args) {

        InMemoryDataBaseTest inMemoryDataBaseTest = new InMemoryDataBaseTest();
        inMemoryDataBaseTest.firstDataBaseTest();
        inMemoryDataBaseTest.secondDataBaseTestNegativeResult();

    }

    void firstDataBaseTest() {
        Product product1 = new Product("Iphone");
        InMemoryDataBase inMemoryDataBase = new InMemoryDataBase();
        inMemoryDataBase.save(product1);
        Product result = inMemoryDataBase.findByTitle("Iphone");
        if (product1.equals(result)) {
            System.out.println("Test1 for finding product by Title = OK");
        } else {
            System.out.println("Shit happens! Test1 = FAIL");
        }
    }

    void secondDataBaseTestNegativeResult() {
        Product product1 = new Product("Samsung");
        InMemoryDataBase inMemoryDataBase = new InMemoryDataBase();
        inMemoryDataBase.save(product1);
        Product result = inMemoryDataBase.findByTitle("Iphone");
        if (product1.equals(result)) {
            System.out.println("Test2 for finding product by Title = OK");
        } else {
            System.out.println("Shit happens! Test2 = FAIL");
        }
    }
}
