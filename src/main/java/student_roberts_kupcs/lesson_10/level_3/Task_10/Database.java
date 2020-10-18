package student_roberts_kupcs.lesson_10.level_3.Task_10;

import java.util.Optional;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
interface Database {
    void save(Product product);

    @CodeReviewComment(teacher = "Return type must be Optional<Product>")
    Product findByTitle(String productTitle);
}
