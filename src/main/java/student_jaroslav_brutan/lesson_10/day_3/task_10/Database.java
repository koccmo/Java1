package student_jaroslav_brutan.lesson_10.day_3.task_10;

import java.util.Optional;

public interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
