package student_anvars_intezars.home_tasks.lesson_10.level_3.task_8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface Database {

    void save(Product product);

    Product findByTitle(String productTitle);

}
