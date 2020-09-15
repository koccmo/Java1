package student_eduards_jasvins.lesson_10.day_3.task_10;

class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();
        test.addProduct();
        test.findProduct();
        test.nullProduct();
    }

    void addProduct() {
        InMemoryDatabase database = new InMemoryDatabase();
        Product product = new Product("Glass");

        database.save(product);

        if (product.getTitle().equals("Glass")) {
            System.out.println("Test ADD = OK.");
        } else {
            System.out.println("Test ADD = FAIL.");
        }
    }

    void findProduct() {
        InMemoryDatabase database = new InMemoryDatabase();
        Product product = new Product("Glass");
        Product product2 = new Product("Phone");
        Product product3 = new Product("Bottle");

        database.save(product);
        database.save(product2);
        database.save(product3);

        if (product2.getTitle().equals("Phone")) {
            System.out.println("Test FIND = OK.");
        } else {
            System.out.println("Test FIND = FAIL.");
        }
    }

    void nullProduct() {
        InMemoryDatabase database = new InMemoryDatabase();
        Product product = new Product("Glass");
        Product product2 = new Product("Phone");
        Product product3 = new Product("Bottle");

        database.save(product);
        database.save(product2);
        database.save(product3);

        database.findByTitle("Pivo").orElse(null);
        if (database.findByTitle(null).equals("Pivo")){
            System.out.println("Test NULL = OK.");
        } else {
            System.out.println("Test NULL = FAIL.");
        }
    }
}
