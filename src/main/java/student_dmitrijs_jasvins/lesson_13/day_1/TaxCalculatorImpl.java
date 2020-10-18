package student_dmitrijs_jasvins.lesson_13.day_1;

import java.math.BigDecimal;

public class TaxCalculatorImpl  implements TaxCalculator {

    private final BigDecimal MaxValue = new BigDecimal("20000");


    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(MaxValue) <= 0){
            return income.multiply(new BigDecimal("0.25"));
        } else {
            BigDecimal taxBefore20000 = MaxValue.multiply(new BigDecimal("0.25"));
            BigDecimal taxAfter20000 = income.subtract(MaxValue).multiply(new BigDecimal("0.40"));
            return taxBefore20000.add(taxAfter20000);
        }
    }
}
