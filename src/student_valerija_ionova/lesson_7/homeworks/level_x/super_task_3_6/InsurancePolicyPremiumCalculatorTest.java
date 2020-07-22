package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_3_6;

//Написать автоматические юнит тесты для класса InsurancePolicyPremiumCalculator.

import java.math.BigDecimal;

public class InsurancePolicyPremiumCalculatorTest {

    public static void main(String [] args){
        InsurancePolicyPremiumCalculatorTest insurancePolicyPremiumCalculatorTest = new InsurancePolicyPremiumCalculatorTest();

        insurancePolicyPremiumCalculatorTest.testInsurancePolicyPremiumCalculator();
        insurancePolicyPremiumCalculatorTest.testInsurancePolicyPremiumCalculatorWithSubObject();

    }

    public void testInsurancePolicyPremiumCalculator(){
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();

        BigDecimal insuranceObjectPrice = new BigDecimal ("25000");
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.HOUSE, insuranceObjectPrice);
        insuranceObject.addInsuranceRisk(InsuranceRisk.THEFT);

        Policy policy = new Policy();
        policy.addInsuranceObject(insuranceObject);

        BigDecimal expectedResult = new BigDecimal("500");

        if (insurancePolicyPremiumCalculator.calculate(policy).compareTo(expectedResult) == 0){
            System.out.println("testInsurancePolicyPremiumCalculator OK");
        }else{
            System.out.println("testInsurancePolicyPremiumCalculator FAIL");
        }

    }

    public void testInsurancePolicyPremiumCalculatorWithSubObject(){
        InsurancePolicyPremiumCalculator insurancePolicyPremiumCalculator = new InsurancePolicyPremiumCalculator();

        BigDecimal insuranceObjectPrice = new BigDecimal ("5000");
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT, insuranceObjectPrice);
        insuranceObject.addInsuranceRisk(InsuranceRisk.FIRE);

        BigDecimal price = new BigDecimal ("55");
        SubInsuranceObject subInsuranceObject = new SubInsuranceObject("TV", price);
        subInsuranceObject.addInsuranceRisk(InsuranceRisk.THEFT);
        insuranceObject.getSubInsuranceObjects();

        Policy policy = new Policy();
        policy.addInsuranceObject(insuranceObject);

        BigDecimal expectedResult = new BigDecimal("100");

        if (insurancePolicyPremiumCalculator.calculate(policy).compareTo(expectedResult) == 0){
            System.out.println("testInsurancePolicyPremiumCalculator OK");
        }else{
            System.out.println("testInsurancePolicyPremiumCalculator FAIL");
        }

    }
}
