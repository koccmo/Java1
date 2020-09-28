package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

//Task39

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface FieldValidationRule {

    void validate(Product product) throws ValidationException;

}