package student_valerija_ionova.lesson_6.level_x.super_task_1;

import student_valerija_ionova.lesson_x.part_2_basic.task_19_26.ExpenseCategory;

public class ElectricDeviceFactoryTest {

    public static void main (String [] args){
        ElectricDeviceFactoryTest electricDeviceFactoryTest = new ElectricDeviceFactoryTest();

        electricDeviceFactoryTest.testOfAmountCreateElectricDeviceWithBothExtraInsurance();
        electricDeviceFactoryTest.testOfInsuranceCategoryCreateElectricDeviceWithBothExtraInsurance();
        electricDeviceFactoryTest.testOfInsuranceCategoryCreateElectricDeviceWithFireInsurance();
        electricDeviceFactoryTest.testOfInsuranceCategoryCreateElectricDeviceWithStealInsurance();
electricDeviceFactoryTest.testOfAmountCreateElectricDeviceWithoutInsurance();

    }

    public void printResult(String name, boolean positiveResultOfTest){
        if (positiveResultOfTest){
            System.out.println(name+" OK\n");
        }else{
            System.out.println(name+" FAIL\n");
        }
    }

    public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
        printResult(name, methodsResult == expectedResult);
    }

    public void checkDouble(String name, double methodsResult, double expectedResult){
        printResult(name, methodsResult == expectedResult);
    }

    public void testOfAmountCreateElectricDeviceWithBothExtraInsurance(){
        ElectricDeviceFactory electricDeviceFactory = new ElectricDeviceFactory();
        ElectricDevice newElectricDevice = electricDeviceFactory.createElectricDeviceWithExtraInsurance("TV", 22.01, InsuranceCategory.BOTH);
        checkDouble("testOfAmountCreateElectricDeviceWithBothExtraInsurance", newElectricDevice.getCost(), 22.01);
    }

    public void testOfInsuranceCategoryCreateElectricDeviceWithBothExtraInsurance(){
        ElectricDeviceFactory electricDeviceFactory = new ElectricDeviceFactory();
        ElectricDevice newElectricDevice = electricDeviceFactory.createElectricDeviceWithExtraInsurance("TV", 22.01, InsuranceCategory.BOTH);
        checkBoolean("testOfInsuranceCategoryCreateElectricDeviceWithBothExtraInsurance", newElectricDevice.isBothInsurance(), true);
    }

    public void testOfInsuranceCategoryCreateElectricDeviceWithFireInsurance(){
        ElectricDeviceFactory electricDeviceFactory = new ElectricDeviceFactory();
        ElectricDevice newElectricDevice = electricDeviceFactory.createElectricDeviceWithExtraInsurance("TV", 22.01, InsuranceCategory.FIRE);
        checkBoolean("testOfInsuranceCategoryCreateElectricDeviceWithFireInsurance", newElectricDevice.isFireInsurance(), true);
    }

    public void testOfInsuranceCategoryCreateElectricDeviceWithStealInsurance(){
        ElectricDeviceFactory electricDeviceFactory = new ElectricDeviceFactory();
        ElectricDevice newElectricDevice = electricDeviceFactory.createElectricDeviceWithExtraInsurance("TV", 22.01, InsuranceCategory.STEAL);
        checkBoolean("testOfInsuranceCategoryCreateElectricDeviceWithStealInsurance", newElectricDevice.isStealInsurance(), true);
    }

    public void testOfAmountCreateElectricDeviceWithoutInsurance(){
        ElectricDeviceFactory electricDeviceFactory = new ElectricDeviceFactory();
        ElectricDevice newElectricDevice = electricDeviceFactory.createElectricDeviceWithoutInsurance("TV", 22.01);
        checkDouble("testOfAmountCreateElectricDeviceWithoutInsurance", newElectricDevice.getCost(), 22.01);
    }



}
