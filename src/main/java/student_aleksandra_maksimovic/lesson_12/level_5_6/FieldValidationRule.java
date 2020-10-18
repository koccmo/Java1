package student_aleksandra_maksimovic.lesson_12.level_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface FieldValidationRule {
    void validate(Product product) throws ValidationException;
}
