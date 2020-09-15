package student_igors_bartkevics.lesson_7.lesson_code.calculator;

import student_igors_bartkevics.lesson_7.lesson_code.calculator.domain.InsuranceObject;
import student_igors_bartkevics.lesson_7.lesson_code.calculator.domain.Policy;
import student_igors_bartkevics.lesson_7.lesson_code.calculator.domain.RiskType;
import student_igors_bartkevics.lesson_7.lesson_code.calculator.domain.SubInsuranceObject;

import java.math.BigDecimal;

class InsurancePolicyCalculatorTest {

        InsurancePolicyCalculator calculator = new InsurancePolicyCalculator();

        public static void main(String[] args) {
            InsurancePolicyCalculatorTest test = new InsurancePolicyCalculatorTest();
            test.test1();
            test.test2();
            test.test3();
            test.test4();
            test.test5();
            test.test6();
            test.test7();
        }

        public void test1(){
            InsuranceObject house = new InsuranceObject();
            Policy policy = new Policy(house);
            BigDecimal premium = calculator.calculate(policy);
            // public int compareTo(BigDecimal val);
            // This method returns -1 if the BigDecimal is less than val,
            // 1 if the BigDecimal is greater than val
            // and 0 if the BigDecimal is equal to val
            checkResult((premium.compareTo(new BigDecimal("0.00")) == 0), "test1");
        }

    public void test2(){
        SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"), RiskType.FIRE);
        InsuranceObject house = new InsuranceObject(notebook);
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult((premium.compareTo(new BigDecimal("3.00")) == 0), "test2");
    }

    public void test3(){
        SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"), RiskType.THIEF);
        InsuranceObject house = new InsuranceObject(notebook);
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult((premium.compareTo(new BigDecimal("1.00")) == 0), "test3");
    }

    public void test4(){
        SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"), RiskType.FIRE, RiskType.THIEF);
        InsuranceObject house = new InsuranceObject(notebook);
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult((premium.compareTo(new BigDecimal("4.00")) == 0), "test4");
    }

    public void test5() {
        SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"), RiskType.FIRE, RiskType.THIEF);
        InsuranceObject house = new InsuranceObject(notebook);

        SubInsuranceObject tv = new SubInsuranceObject("TV", new BigDecimal("100.00"), RiskType.FIRE, RiskType.THIEF);
        InsuranceObject flat = new InsuranceObject(tv);

        Policy policy = new Policy(house, flat);
        BigDecimal premium = calculator.calculate(policy);
        checkResult((premium.compareTo(new BigDecimal("8.00")) == 0), "test5");
    }

    public void test6(){
        SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("5000.00"), RiskType.THIEF);
        InsuranceObject house = new InsuranceObject(notebook);
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult((premium.compareTo(new BigDecimal("100.00")) == 0), "test6");
    }

    public void test7(){
        SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("5000.00"), RiskType.FIRE);
        InsuranceObject house = new InsuranceObject(notebook);
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult((premium.compareTo(new BigDecimal("200.00")) == 0), "test7");
    }

    private void checkResult(boolean condition, String testName) {
            if (condition) {
                System.out.println(testName + " = OK!");
            } else {
                System.out.println(testName + " = FAIL!");
            }
        }

}
