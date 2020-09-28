package student_volodya_danilin.lesson_12.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface FieldValidationRule {

    void validate(Product product) throws ValidationException;

}
