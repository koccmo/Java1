package student_dmitrijs_jasvins.lesson_10.day_3.task_8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.add();
        demo.findByTitle();
        demo.findProductNull();
    }

    void add() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Phone");
        inMemoryDatabase.save(product);
        if (product.getTitle().equals("Phone")) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = Fail");
        }
    }

    void findByTitle() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Car");
        Product product1 = new Product("House");
        Product product2 = new Product("Plane");

        inMemoryDatabase.save(product);
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);

        if (inMemoryDatabase.findByTitle("Car").equals(product)) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

    void findProductNull() {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product product = new Product("Car");
        Product product1 = new Product("House");
        Product product2 = new Product("Plane");

        inMemoryDatabase.save(product);
        inMemoryDatabase.save(product1);
        inMemoryDatabase.save(product2);

        if (inMemoryDatabase.findByTitle("Flat") == null) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }
}