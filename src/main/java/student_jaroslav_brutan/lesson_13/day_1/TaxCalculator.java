package student_jaroslav_brutan.lesson_13.day_1;

import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);
}
