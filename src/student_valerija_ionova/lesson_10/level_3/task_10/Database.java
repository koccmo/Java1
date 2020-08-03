package student_valerija_ionova.lesson_10.level_3.task_10;

import java.util.Optional;

interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}