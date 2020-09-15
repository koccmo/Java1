package student_valerija_ionova.lesson_10.level_3.task_10;


import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class InMemoryDatabaseTest {

    public static void main (String [] args){

        InMemoryDatabaseTest inMemoryDatabaseTest = new InMemoryDatabaseTest();

        inMemoryDatabaseTest.testProductAdd();
        inMemoryDatabaseTest.testProductFind();
        inMemoryDatabaseTest.testProductFindNotFound();

    }

    void printResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testProductAdd(){

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Milk");
        inMemoryDatabase.save(product);

        printResult("testProductAdd", inMemoryDatabase.getProducts().get(0).getTitle().equals("Milk"));
    }

    void testProductFind(){

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product milk = new Product("Milk");
        Product bread = new Product("Bread");
        inMemoryDatabase.save(milk);
        inMemoryDatabase.save(bread);

        Product expectedResult = new Product("Bread");

        printResult("testProductFindTrue", expectedResult.equals(inMemoryDatabase.findByTitle("Bread").get()));
    }

    void testProductFindNotFound(){

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product milk = new Product("Milk");
        Product bread = new Product("Bread");
        inMemoryDatabase.save(milk);
        inMemoryDatabase.save(bread);

        Optional result = Optional.empty();

        printResult("testProductFindNotFound", inMemoryDatabase.findByTitle("Juice").equals(result));
    }


}
