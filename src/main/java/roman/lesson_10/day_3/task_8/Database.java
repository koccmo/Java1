package roman.lesson_10.day_3.task_8;

public interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);
}
