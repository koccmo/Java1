package student_igors_bartkevics.lesson_13.homework.level_1_intern;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator{

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        return income.multiply(new BigDecimal("0.25"));
    }
}
