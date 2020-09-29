package student_valerija_ionova.lesson_13.level_1_intern;



import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);

}