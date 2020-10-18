package student_alexey_tretyakov.lesson_13.homework.level_1.task_1_3;

import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TaxCalculatorImp implements TaxCalculator{

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if ((income.compareTo( BigDecimal.valueOf(0)) < 0) || (income.compareTo(BigDecimal.valueOf(20000)) > 0)) {
            return null;
        } else {
            return income.multiply( BigDecimal.valueOf(0.25));
        }

    }

}
