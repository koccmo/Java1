package student_valerija_ionova.lesson_6.level_x.super_task_1.first_variant;

class ElectricDeviceFactoryTest {

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

    public void checkInt(String name, int methodsResult, int expectedResult){
        printResult(name, methodsResult == expectedResult);
    }

    public void testOfAmountCreateElectricDeviceWithBothExtraInsurance(){
        ElectricDeviceFactory electricDeviceFactory = new ElectricDeviceFactory();
        ElectricDevice newElectricDevice = electricDeviceFactory.createElectricDeviceWithExtraInsurance("TV", 22, InsuranceCategory.BOTH);
        checkInt("testOfAmountCreateElectricDeviceWithBothExtraInsurance", newElectricDevice.getCost(), 22);
    }

    public void testOfInsuranceCategoryCreateElectricDeviceWithBothExtraInsurance(){
        ElectricDeviceFactory electricDeviceFactory = new ElectricDeviceFactory();
        ElectricDevice newElectricDevice = electricDeviceFactory.createElectricDeviceWithExtraInsurance("TV", 22, InsuranceCategory.BOTH);
        checkBoolean("testOfInsuranceCategoryCreateElectricDeviceWithBothExtraInsurance", newElectricDevice.isBothInsurance(), true);
    }

    public void testOfInsuranceCategoryCreateElectricDeviceWithFireInsurance(){
        ElectricDeviceFactory electricDeviceFactory = new ElectricDeviceFactory();
        ElectricDevice newElectricDevice = electricDeviceFactory.createElectricDeviceWithExtraInsurance("TV", 22, InsuranceCategory.FIRE);
        checkBoolean("testOfInsuranceCategoryCreateElectricDeviceWithFireInsurance", newElectricDevice.isFireInsurance(), true);
    }

    public void testOfInsuranceCategoryCreateElectricDeviceWithStealInsurance(){
        ElectricDeviceFactory electricDeviceFactory = new ElectricDeviceFactory();
        ElectricDevice newElectricDevice = electricDeviceFactory.createElectricDeviceWithExtraInsurance("TV", 22, InsuranceCategory.STEAL);
        checkBoolean("testOfInsuranceCategoryCreateElectricDeviceWithStealInsurance", newElectricDevice.isStealInsurance(), true);
    }

    public void testOfAmountCreateElectricDeviceWithoutInsurance(){
        ElectricDeviceFactory electricDeviceFactory = new ElectricDeviceFactory();
        ElectricDevice newElectricDevice = electricDeviceFactory.createElectricDeviceWithoutInsurance("TV", 22);
        checkInt("testOfAmountCreateElectricDeviceWithoutInsurance", newElectricDevice.getCost(), 22);
    }



}
