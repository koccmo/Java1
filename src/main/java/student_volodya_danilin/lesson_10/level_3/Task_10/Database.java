package student_volodya_danilin.lesson_10.level_3.Task_10;

import java.util.Optional;

interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
