package student_valerija_ionova.lesson_7.homeworks.level_x.super_task_3_6;

//Написать автоматические юнит тесты для класса InsuranceObjectPremiumCalculator.

import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class InsuranceObjectPremiumCalculatorTest {

    public static void main(String [] args){
        InsuranceObjectPremiumCalculatorTest insuranceObjectPremiumCalculatorTest = new InsuranceObjectPremiumCalculatorTest();

        insuranceObjectPremiumCalculatorTest.testCalculateInsuranceObjectPremiumCalculatorFlat();
        insuranceObjectPremiumCalculatorTest.testCalculateInsuranceObjectPremiumCalculatorHouse();
    }


    public void testCalculateInsuranceObjectPremiumCalculatorFlat(){
        InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator = new InsuranceObjectPremiumCalculator();

        BigDecimal price = new BigDecimal ("2000");
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.FLAT, price);
        insuranceObject.addInsuranceRisk(InsuranceRisk.THEFT);

        BigDecimal expectedResult = new BigDecimal ("20");

        if (insuranceObjectPremiumCalculator.calculate(insuranceObject).compareTo(expectedResult) == 0){
            System.out.println("testCalculateInsuranceObjectPremiumCalculatorTest OK");
        }else{
            System.out.println("testCalculateInsuranceObjectPremiumCalculatorTest FAIL");
        }
    }

    public void testCalculateInsuranceObjectPremiumCalculatorHouse(){
        InsuranceObjectPremiumCalculator insuranceObjectPremiumCalculator = new InsuranceObjectPremiumCalculator();

        BigDecimal price = new BigDecimal ("50000");
        InsuranceObject insuranceObject = new InsuranceObject(InsuranceObjectType.HOUSE, price);
        insuranceObject.addInsuranceRisk(InsuranceRisk.FIRE);

        BigDecimal expectedResult = new BigDecimal ("2500");

        if (insuranceObjectPremiumCalculator.calculate(insuranceObject).compareTo(expectedResult) == 0){
            System.out.println("testCalculateInsuranceObjectPremiumCalculatorTest OK");
        }else{
            System.out.println("testCalculateInsuranceObjectPremiumCalculatorTest FAIL");
        }
    }

}
