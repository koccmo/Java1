package student_valerija_ionova.lesson_13.level_1_intern;

//Task2 Создайте класс TaxCalculatorImpl
//Правило номер один: - доход до 20000 облагается 25% налогом.

import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            var incomeBiggerThen20000 = income.subtract(new BigDecimal("20000"));
            var taxAfter20000 = incomeBiggerThen20000.multiply(new BigDecimal("0.40"));
            var taxBefore20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            return taxBefore20000.add(taxAfter20000);
        }
    }
}
