package student_valerija_ionova.lesson_10.level_3.task_10;


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

        Product result = inMemoryDatabase.findByTitle("Bread").orElse(null);

        printResult("testProductFind", result.getTitle().equals("Bread"));
    }

    void testProductFindNotFound(){

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product milk = new Product("Milk");
        Product bread = new Product("Bread");
        inMemoryDatabase.save(milk);
        inMemoryDatabase.save(bread);

        Product result = inMemoryDatabase.findByTitle("Potatoes").orElse(null);

        printResult("testProductFind", result == null);
    }


}
