package student_anvars_intezars.home_tasks.lesson_10.level_3.task_10;

import java.util.List;
import java.util.Optional;

class DataBaseImplTest {

    public static void main(String[] args) {

        DataBaseImplTest dataBaseImplTest = new DataBaseImplTest();
        dataBaseImplTest.firstDataBaseImplTest();
        dataBaseImplTest.secondDataBaseImplTest();
        dataBaseImplTest.negativeScenarioTest();
    }

    void firstDataBaseImplTest() {
        Product coffee = new Product("Nescafe");
        DatabaseImpl database = new DatabaseImpl();
        database.save(coffee);
        Optional<Product> result = database.findByTitle("Nescafe");
        if (result.isPresent()) {
            System.out.println("Test1 for finding product by Title = OK");
        } else {
            System.out.println("Test1 for finding product by Title = FAIL");
        }
    }

    void secondDataBaseImplTest() {
        Product chocolate = new Product("Bounty");
        DatabaseImpl database = new DatabaseImpl();
        database.save(chocolate);
        Optional<Product> result = database.findByTitle("Bounty");
        if (result.isPresent()) {
            System.out.println("Test2 for finding product by Title = OK");
        } else {
            System.out.println("Test2 for finding product by Title = FAIL");
        }
    }

    void negativeScenarioTest() {
        Product drink = new Product("Sprite");
        DatabaseImpl database = new DatabaseImpl();
        database.save(drink);
        Optional<Product> result = database.findByTitle("Fanta");
        if (result.isPresent()) {
            System.out.println("Test3 for finding product by Title = OK");
        } else {
            System.out.println("Test3 for finding product by Title = FAIL");
        }
    }
}
