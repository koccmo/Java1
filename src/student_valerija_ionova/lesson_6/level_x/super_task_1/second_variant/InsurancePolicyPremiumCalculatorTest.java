package student_valerija_ionova.lesson_6.level_x.super_task_1.second_variant;

import java.math.BigDecimal;

class InsurancePolicyPremiumCalculatorTest {

    InsurancePolicyPremiumCalculator calculator = new InsurancePolicyPremiumCalculator();

    public static void main(String[] args) {
        InsurancePolicyPremiumCalculatorTest test = new InsurancePolicyPremiumCalculatorTest();
        test.testWithoutElectricDevices();
        test.testOneElectricDeviceWithFireInsurance();
        test.testOneElectricDeviceWithStealInsurance();
        test.testOneElectricDeviceWithStealAndFireInsurance();
        test.testTwoObjectsWithElectricDevices();
        test.testOneElectricDeviceWithStealInsuranceBigCoefficient();
        test.testOneElectricDeviceWithFireInsuranceBigCoefficient();
    }

    private void checkResult(boolean testPassed, String name) {
        if (testPassed) {
            System.out.println(name + " OK\n");
        } else {
            System.out.println(name + " FAIL\n");
        }
    }

    public void testWithoutElectricDevices() {
        ObjectForPolicy house = new ObjectForPolicy();
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("0.00")) == 0, "testWithoutElectricDevices");
    }

    public void testOneElectricDeviceWithFireInsurance() {
        ElectricDevice notebook = new ElectricDevice("Notebook", new BigDecimal("100.00"), InsuranceCategory.FIRE);
        ObjectForPolicy house = new ObjectForPolicy(notebook);
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("3.00")) == 0, "testOneElectricDeviceWithFireInsurance");
    }

    public void testOneElectricDeviceWithStealInsurance() {
        ElectricDevice notebook = new ElectricDevice("Notebook", new BigDecimal("100.00"), InsuranceCategory.STEAl);
        ObjectForPolicy house = new ObjectForPolicy(notebook);
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("1.00")) == 0, "testOneElectricDeviceWithStealInsurance");
    }

    public void testOneElectricDeviceWithStealAndFireInsurance() {
        ElectricDevice notebook = new ElectricDevice("Notebook", new BigDecimal("100.00"), InsuranceCategory.STEAl, InsuranceCategory.FIRE);
        ObjectForPolicy house = new ObjectForPolicy(notebook);
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("4.00")) == 0, "testOneElectricDeviceWithStealAndFireInsurance");
    }

    public void testTwoObjectsWithElectricDevices() {
        ElectricDevice notebook = new ElectricDevice("Notebook", new BigDecimal("100.00"), InsuranceCategory.STEAl, InsuranceCategory.FIRE);
        ObjectForPolicy house = new ObjectForPolicy(notebook);

        ElectricDevice tv = new ElectricDevice("TV", new BigDecimal("100.00"), InsuranceCategory.STEAl, InsuranceCategory.FIRE);
        ObjectForPolicy flat = new ObjectForPolicy(tv);

        Policy policy = new Policy(house, flat);
        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("8.00")) == 0, "testTwoObjectsWithElectricDevices");
    }

    public void testOneElectricDeviceWithStealInsuranceBigCoefficient() {
        ElectricDevice notebook = new ElectricDevice("Notebook", new BigDecimal("5000.00"), InsuranceCategory.STEAl);
        ObjectForPolicy house = new ObjectForPolicy(notebook);
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("100.00")) == 0, "testOneElectricDeviceWithStealInsuranceBigCoefficient");
    }

    public void testOneElectricDeviceWithFireInsuranceBigCoefficient() {
        ElectricDevice notebook = new ElectricDevice("Notebook", new BigDecimal("5000.00"), InsuranceCategory.FIRE);
        ObjectForPolicy house = new ObjectForPolicy(notebook);
        Policy policy = new Policy(house);
        BigDecimal premium = calculator.calculate(policy);
        checkResult(premium.compareTo(new BigDecimal("200.00")) == 0, "testOneElectricDeviceWithFireInsuranceBigCoefficient");
    }



}
