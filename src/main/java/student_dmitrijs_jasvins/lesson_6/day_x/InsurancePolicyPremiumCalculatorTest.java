package student_dmitrijs_jasvins.lesson_6.day_x;

import java.math.BigDecimal;


public class InsurancePolicyPremiumCalculatorTest {
    private InsurancePolicyPremiumCalculator calculator = new InsurancePolicyPremiumCalculator();

    public static void main(String[] args) {
        InsurancePolicyPremiumCalculatorTest test = new InsurancePolicyPremiumCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
    }

    public void test1() {
        InsuranceObject house = new InsuranceObject();

        Policy policy = new Policy(house);

        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("0.00")) == 0, "Test1");
    }


    public void test2() {
        SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"),
                RiskType.FIRE);
        InsuranceObject house = new InsuranceObject(notebook);
        Policy policy = new Policy(house);

        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("3.00")) == 0, "Test2");
    }


    public void test3() {
        SubInsuranceObject tv1 = new SubInsuranceObject("Tv", new BigDecimal("100.00"),
                RiskType.THIEF);
        InsuranceObject house = new InsuranceObject(tv1);
        Policy policy = new Policy(house);

        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("1.00")) == 0, "Test3");
    }

    public void test4() {
        SubInsuranceObject tv1 = new SubInsuranceObject("Tv1", new BigDecimal("100.00"),
                RiskType.THIEF, RiskType.FIRE);
        InsuranceObject house = new InsuranceObject(tv1);
        Policy policy = new Policy(house);

        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("4.00")) == 0, "Test4");
    }

    public void test5() {
        SubInsuranceObject tv1 = new SubInsuranceObject("Tv1", new BigDecimal("100.00"),
                RiskType.THIEF, RiskType.FIRE);
        SubInsuranceObject notebook = new SubInsuranceObject("Notebook", new BigDecimal("100.00"),
                RiskType.THIEF, RiskType.FIRE);

        InsuranceObject house = new InsuranceObject(tv1);
        InsuranceObject flat = new InsuranceObject(notebook);

        Policy policy = new Policy(house, flat);

        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("8.00")) == 0, "Test5");
    }

    public void test6() {
        SubInsuranceObject notebook = new SubInsuranceObject("notebook", new BigDecimal("5000.00"),
                RiskType.THIEF, RiskType.FIRE);
        InsuranceObject house = new InsuranceObject(notebook);
        Policy policy = new Policy(house);

        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("100.00")) == 0, "Test6");
    }

    public void test7() {
        SubInsuranceObject notebook = new SubInsuranceObject("notebook", new BigDecimal("5000.00"),
                RiskType.THIEF, RiskType.FIRE);
        InsuranceObject house = new InsuranceObject(notebook);
        Policy policy = new Policy(house);

        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("200.00")) == 0, "Test7");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
}
