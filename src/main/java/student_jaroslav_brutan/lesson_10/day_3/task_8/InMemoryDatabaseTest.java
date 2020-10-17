package student_jaroslav_brutan.lesson_10.day_3.task_8;

import teacher.codereview.CodeReview;

@CodeReview(approved = false)
//Updated
public class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.saveAndSearchTest();
    }

    void saveAndSearchTest(){
        Product product1 = new Product("Guitar");
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        inMemoryDatabase.save(product1);
        Product result = inMemoryDatabase.findByTitle("Guitar");
        if (product1.equals(result)){
            System.out.println("Test - OK!");
        } else{
            System.out.println("Test - FAIL!");
        }
    }
}
