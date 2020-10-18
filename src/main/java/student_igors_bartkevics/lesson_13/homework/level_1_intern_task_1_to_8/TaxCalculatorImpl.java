package student_igors_bartkevics.lesson_13.homework.level_1_intern_task_1_to_8;

import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TaxCalculatorImpl implements TaxCalculator{

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) < 0) {
            return income.multiply(new BigDecimal("0.25"));
        }
        else {
            BigDecimal taxOf2000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            BigDecimal incomeOver2000 = income.subtract(new BigDecimal("20000"));
            BigDecimal taxOver2000 = incomeOver2000.multiply(new BigDecimal("0.4"));
            return taxOf2000.add(taxOver2000);
        }
    }
}
