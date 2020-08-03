package student_valerija_ionova.lesson_10.level_3.task_8;

class InMemoryDatabaseDemo {

    public static void main (String [] args){

        InMemoryDatabaseDemo inMemoryDatabaseDemo = new InMemoryDatabaseDemo();

        inMemoryDatabaseDemo.testAddProduct();
        inMemoryDatabaseDemo.testFindProduct();
        inMemoryDatabaseDemo.testFindProductNull();

    }

    void printResult (String name, boolean testPassed){
        if (testPassed){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testAddProduct(){

        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Milk");

        inMemoryDatabase.save(product);

        printResult("TestAddProduct", inMemoryDatabase.getProducts().get(0).getTitle().equals("Milk"));
    }

     void testFindProduct(){
         InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
         Product product1 = new Product("Milk");
         Product product2 = new Product("Cake");
         Product product3 = new Product("Chocolate");

         inMemoryDatabase.save(product1);
         inMemoryDatabase.save(product2);
         inMemoryDatabase.save(product3);

         printResult("testFindProduct", inMemoryDatabase.findByTitle("Cake").equals(product2));

     }

    void testFindProductNull(){
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product1 = new Product("Milk");
        Product product2 = new Product("Cake");
        Product product3 = new Product("Chocolate");

        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);
        inMemoryDatabase.save(product3);

        printResult("testFindProductNull", inMemoryDatabase.findByTitle("IceCream") == null);
    }

}
