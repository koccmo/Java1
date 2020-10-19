package student_jaroslav_brutan.lesson_12.day_5_and_6;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface ProductValidator {

    List<ValidationException> validate(Product product);
}
