package student_alexey_tretyakov.lesson_13.homework.level_1.task_4_6;


import java.math.BigDecimal;

public class TaxCalculatorImp implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if ((income.compareTo( BigDecimal.valueOf(0)) <= 0)){
            return  BigDecimal.valueOf(0.00);
        }
        if(income.compareTo(BigDecimal.valueOf(20000.00)) > 0)   {
            BigDecimal tax = income.subtract(BigDecimal.valueOf(20000.00));
            tax = tax.multiply(BigDecimal.valueOf(0.4));
            tax = tax.add(BigDecimal.valueOf(20000.00*0.25));
            return tax;
        } else {
            return income.multiply( BigDecimal.valueOf(0.25));
        }

    }

}
