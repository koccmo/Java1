package student_dmitrijs_jasvins.lesson_12.day_5_6;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface ProductValidator {

    List<ValidationException> validate(Product product);
}
