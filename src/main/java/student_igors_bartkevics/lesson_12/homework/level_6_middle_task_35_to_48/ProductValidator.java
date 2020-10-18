package student_igors_bartkevics.lesson_12.homework.level_6_middle_task_35_to_48;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface ProductValidator {

    List<ValidationException> validate(Product product);

}