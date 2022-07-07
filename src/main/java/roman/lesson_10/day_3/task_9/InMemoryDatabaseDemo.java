package roman.lesson_10.day_3.task_9;


public class InMemoryDatabaseDemo {
    public static void main(String[] args) {
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();

        Product apple = new Product("Apple");
        Product dell = new Product("Dell");

        inMemoryDatabase.save(apple);
        inMemoryDatabase.save(dell);

        System.out.println(inMemoryDatabase.findByTitle("Asus"));
        System.out.println(inMemoryDatabase.findByTitle("Apple"));


    }
}
