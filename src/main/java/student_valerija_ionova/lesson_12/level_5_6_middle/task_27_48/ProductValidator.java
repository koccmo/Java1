package student_valerija_ionova.lesson_12.level_5_6_middle.task_27_48;

//Task32

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface ProductValidator {

    List<ValidationException> validate(Product product);

}
