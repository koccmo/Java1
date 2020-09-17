package student_alexey_tretyakov.lesson_13.homework.level_1.task_1;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxCalculatorImpTest {
    TaxCalculatorImp taxCalculatorImp = new TaxCalculatorImp();

    @Test
    public void calculateTax() {
        BigDecimal tax = taxCalculatorImp.calculateTax(BigDecimal.valueOf(10000));
        assertEquals(0,tax.compareTo(BigDecimal.valueOf(2500)));
    }
    @Test
    public void calculateTaxMax() {
        BigDecimal tax = taxCalculatorImp.calculateTax(BigDecimal.valueOf(20000));
        assertEquals(0,tax.compareTo(BigDecimal.valueOf(5000)));
    }
    @Test
    public void calculateTaxBig() {
        BigDecimal tax = taxCalculatorImp.calculateTax(BigDecimal.valueOf(40000));
        assertNull(tax);
    }
    @Test
    public void calculateTaxZero() {
        BigDecimal tax = taxCalculatorImp.calculateTax(BigDecimal.valueOf( 0 ));
        assertEquals(0,tax.compareTo(BigDecimal.valueOf( 0 )));
    }
}