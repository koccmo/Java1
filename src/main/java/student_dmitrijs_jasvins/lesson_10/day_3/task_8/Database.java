package student_dmitrijs_jasvins.lesson_10.day_3.task_8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
