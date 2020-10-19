package student_roberts_kupcs.lesson_12.homework.level_5_6;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface ProductValidator {

    List<ValidationException> validate(Product product);

}
