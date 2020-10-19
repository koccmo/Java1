package student_jaroslav_brutan.lesson_12.day_5_and_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface FieldValidationRule {

    void validate(Product product) throws ValidationException;
}
