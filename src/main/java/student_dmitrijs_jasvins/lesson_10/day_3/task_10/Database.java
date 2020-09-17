package student_dmitrijs_jasvins.lesson_10.day_3.task_10;

import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface Database {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
