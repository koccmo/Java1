package student_alexey_tretyakov.lesson_13.homework.level_1.task_4_8;


import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);

}
