package student_roberts_kupcs.lesson_13.homework.level_1;

import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);

}
