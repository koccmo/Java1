package student_eduards_jasvins.lesson_12.day_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface FieldValidationRule {

    void validate(Product product) throws ValidationException;
}
