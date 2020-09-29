package student_igors_bartkevics.lesson_12.homework.level_6_middle_task_35_to_48;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface FieldValidationRule {

    void validate(Product product) throws ValidationException;

}
