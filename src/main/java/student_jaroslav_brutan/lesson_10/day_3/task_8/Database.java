package student_jaroslav_brutan.lesson_10.day_3.task_8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);
}
