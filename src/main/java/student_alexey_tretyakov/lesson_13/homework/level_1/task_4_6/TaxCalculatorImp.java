package student_alexey_tretyakov.lesson_13.homework.level_1.task_4_6;


import java.math.BigDecimal;

public class TaxCalculatorImp implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        var taxBorder = new BigDecimal(20000);
        if( income.compareTo( taxBorder ) > 0)   {
            BigDecimal tax = income.subtract( taxBorder );
            tax = tax.multiply(BigDecimal.valueOf( 0.40 ));
            return tax.add( taxBorder.multiply( BigDecimal.valueOf( 0.25 )));
        } else {
            return income.multiply( BigDecimal.valueOf( 0.25 ));
        }

    }

}
