package student_roberts_kupcs.lesson_10.level_3.Task_10;

import java.util.Optional;

interface Database {
    void save(Product product);

    Product findByTitle(String productTitle);
}
