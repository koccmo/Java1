package student_anvars_intezars.home_tasks.lesson_10.level_3.task_10;

import java.util.List;
import java.util.Optional;

interface Database {

    void save(Product product);

   // Product findByTitle(String productTitle);

    Optional<Product>findByTitle(String title);

}
