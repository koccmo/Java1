package student_aleksandra_maksimovic.lesson_12.level_5_6;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
