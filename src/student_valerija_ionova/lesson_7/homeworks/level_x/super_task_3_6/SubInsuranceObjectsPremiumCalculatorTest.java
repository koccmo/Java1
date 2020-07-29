package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_3_6;


//Написать автоматические юнит тесты для класса SubInsuranceObjectsPremiumCalculator.

import java.math.BigDecimal;

class SubInsuranceObjectsPremiumCalculatorTest {

    public static void main(String [] args){
        SubInsuranceObjectsPremiumCalculatorTest subInsuranceObjectsPremiumCalculatorTest = new SubInsuranceObjectsPremiumCalculatorTest();

        subInsuranceObjectsPremiumCalculatorTest.testCalculateSubInsuranceObjectsPremiumCalculatorStandartRisk();
        subInsuranceObjectsPremiumCalculatorTest.testCalculateSubInsuranceObjectsPremiumCalculatorOverPricedRisk();

        subInsuranceObjectsPremiumCalculatorTest.testCalculateSubInsuranceObjectsPremiumCalculatorFloodRisk();

    }

    public void testCalculateSubInsuranceObjectsPremiumCalculatorStandartRisk(){

        SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator = new SubInsuranceObjectsPremiumCalculator();
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT, BigDecimal.TEN);
        SubInsuranceObject subInsuranceObject = new SubInsuranceObject("TV", BigDecimal.ONE);
        subInsuranceObject.addInsuranceRisk(InsuranceRisk.FIRE);

        insuranceObject.addSubInsuranceObject(subInsuranceObject);

        BigDecimal expectedResult = new BigDecimal("0.03");

        if (subInsuranceObjectsPremiumCalculator.calculate(insuranceObject).compareTo(expectedResult) == 0){
            System.out.println("testCalculateSubInsuranceObjectsPremiumCalculator OK");
        }else{
            System.out.println("testCalculateSubInsuranceObjectsPremiumCalculator FAIL");
        }
    }

    public void testCalculateSubInsuranceObjectsPremiumCalculatorOverPricedRisk(){

        SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator = new SubInsuranceObjectsPremiumCalculator();

        BigDecimal price = new BigDecimal("10000");
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT, BigDecimal.TEN);
        SubInsuranceObject subInsuranceObject = new SubInsuranceObject("TV", price);
        subInsuranceObject.addInsuranceRisk(InsuranceRisk.FIRE);
        insuranceObject.addSubInsuranceObject(subInsuranceObject);

        BigDecimal expectedResult = new BigDecimal("400");

        if (subInsuranceObjectsPremiumCalculator.calculate(insuranceObject).compareTo(expectedResult) == 0){
            System.out.println("testCalculateSubInsuranceObjectsPremiumCalculator OK");
        }else{
            System.out.println("testCalculateSubInsuranceObjectsPremiumCalculator FAIL");
        }
    }

    public void testCalculateSubInsuranceObjectsPremiumCalculatorFloodRisk(){

        SubInsuranceObjectsPremiumCalculator subInsuranceObjectsPremiumCalculator = new SubInsuranceObjectsPremiumCalculator();

        BigDecimal price = new BigDecimal("10000");
        BigDecimal price1 = new BigDecimal("8000");
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT, price1);
        SubInsuranceObject subInsuranceObject = new SubInsuranceObject("TV", price);
        subInsuranceObject.addInsuranceRisk(InsuranceRisk.FLOOD);
        insuranceObject.addSubInsuranceObject(subInsuranceObject);

        BigDecimal expectedResult = new BigDecimal("800");

        if (subInsuranceObjectsPremiumCalculator.calculate(insuranceObject).compareTo(expectedResult) == 0){
            System.out.println("testCalculateSubInsuranceObjectsPremiumCalculatorFloodRisk OK");
        }else{
            System.out.println("testCalculateSubInsuranceObjectsPremiumCalculatorFloodRisk FAIL");
        }
    }


}
