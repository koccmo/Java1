package student_valerija_ionova.lesson_6.level_x.super_task_1.first_variant;

public class PremiumCalculatorTest {

    public static void main(String[] args) {
        PremiumCalculatorTest premiumCalculatorTest = new PremiumCalculatorTest();

        premiumCalculatorTest.testCoefficientFireInsuranceSmall();
        premiumCalculatorTest.testCoefficientFireInsuranceBig();

        premiumCalculatorTest.testCoefficientStealInsuranceSmall();
        premiumCalculatorTest.testCoefficientStealInsuranceBig();

        premiumCalculatorTest.testFireInsurancePremiumSmallCoefficient();
        premiumCalculatorTest.testFireInsurancePremiumBigCoefficient();
        premiumCalculatorTest.testFireInsuranceNoFireInsurance();

        premiumCalculatorTest.testStealInsurancePremiumSmallCoefficient();
        premiumCalculatorTest.testStealInsurancePremiumBigCoefficient();
        premiumCalculatorTest.testStealInsuranceNoStealInsurance();

        premiumCalculatorTest.testElectricDeviceInsurancePremiumSmallCoefficients();
        premiumCalculatorTest.testElectricDeviceInsurancePremiumBigCoefficient();
        premiumCalculatorTest.testElectricDeviceInsuranceNoExtraInsurance();

        premiumCalculatorTest.testPolicyInsuranceNoElectricDeviceInsuranceOneObject();
        premiumCalculatorTest.testPolicyInsuranceNoElectricDeviceInsuranceTwoObjects();
        premiumCalculatorTest.testPolicyInsuranceWithElectricDevicesInsuranceOneObject();
        premiumCalculatorTest.testPolicyInsuranceWithElectricDevicesInsuranceTwoObjects();

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

    public void testCoefficientFireInsuranceBig(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 1000, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 2000, InsuranceCategory.BOTH);
        electricDevices[2] = new ElectricDevice("BigPC", 50, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 1000, InsuranceCategory.FIRE);

        checkDouble("testCoefficientFireInsuranceBig", premiumCalculator.coefficientFireInsurance(electricDevices), 0.04);
    }

    public void testCoefficientFireInsuranceSmall(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 20, InsuranceCategory.BOTH);
        electricDevices[2] = new ElectricDevice("BigPC", 50, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100, InsuranceCategory.FIRE);

        checkDouble("testCoefficientFireInsuranceSmall", premiumCalculator.coefficientFireInsurance(electricDevices), 0.03);
    }

    public void testCoefficientStealInsuranceSmall(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 20, InsuranceCategory.BOTH);
        electricDevices[2] = new ElectricDevice("BigPC", 50, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100, InsuranceCategory.FIRE);

        checkDouble("testCoefficientStealInsuranceSmall", premiumCalculator.coefficientStealInsurance(electricDevices), 0.01);
    }

    public void testCoefficientStealInsuranceBig(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 2000, InsuranceCategory.BOTH);
        electricDevices[2] = new ElectricDevice("BigPC", 50000, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100, InsuranceCategory.FIRE);

        checkDouble("testCoefficientStealInsuranceBig", premiumCalculator.coefficientStealInsurance(electricDevices), 0.02);
    }

    public void testFireInsurancePremiumSmallCoefficient(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 20, InsuranceCategory.BOTH);
        electricDevices[2] = new ElectricDevice("BigPC", 50, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100, InsuranceCategory.FIRE);

        checkDouble("testFireInsurancePremiumSmallCoefficient", premiumCalculator.fireInsurancePremium(electricDevices), 3.9);
    }

    public void testFireInsurancePremiumBigCoefficient(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 1000, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 2000, InsuranceCategory.BOTH);
        electricDevices[2] = new ElectricDevice("BigPC", 5000, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 1000, InsuranceCategory.FIRE);

        checkDouble("testFireInsurancePremiumBigCoefficient", premiumCalculator.fireInsurancePremium(electricDevices), 160);
    }

    public void testFireInsuranceNoFireInsurance(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10, InsuranceCategory.STEAL);
        electricDevices[1] = new ElectricDevice("PC", 20, InsuranceCategory.STEAL);
        electricDevices[2] = new ElectricDevice("BigPC", 50, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100);

        checkDouble("testFireInsuranceSmallPremiumNoFireInsurance", premiumCalculator.fireInsurancePremium(electricDevices), 0);
    }

    public void testStealInsurancePremiumSmallCoefficient(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 20, InsuranceCategory.BOTH);
        electricDevices[2] = new ElectricDevice("BigPC", 50, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100, InsuranceCategory.FIRE);

        checkDouble("testStealInsurancePremiumSmallCoefficient", premiumCalculator.stealInsurancePremium(electricDevices), 0.7);
    }

    public void testStealInsurancePremiumBigCoefficient(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 1000, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 2000, InsuranceCategory.BOTH);
        electricDevices[2] = new ElectricDevice("BigPC", 5000, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 1000, InsuranceCategory.FIRE);

        checkDouble("testStealInsurancePremiumBigCoefficient", premiumCalculator.stealInsurancePremium(electricDevices), 140);
    }

    public void testStealInsuranceNoStealInsurance(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 20, InsuranceCategory.FIRE);
        electricDevices[2] = new ElectricDevice("BigPC", 50);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100);

        checkDouble("testStealInsuranceNoStealInsurance", premiumCalculator.stealInsurancePremium(electricDevices), 0);
    }

    public void testElectricDeviceInsurancePremiumSmallCoefficients(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 20, InsuranceCategory.BOTH);
        electricDevices[2] = new ElectricDevice("BigPC", 50, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100, InsuranceCategory.FIRE);

        checkDouble("testElectricDeviceInsurancePremiumSmallCoefficients", Math.round(premiumCalculator.insurancePremiumForElectricDevices(electricDevices)), 5);
    }

    public void testElectricDeviceInsurancePremiumBigCoefficient(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 1000, InsuranceCategory.FIRE);
        electricDevices[1] = new ElectricDevice("PC", 2000, InsuranceCategory.BOTH);
        electricDevices[2] = new ElectricDevice("BigPC", 5000, InsuranceCategory.STEAL);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 1000, InsuranceCategory.FIRE);

        checkDouble("testElectricDeviceInsurancePremiumBigCoefficient", premiumCalculator.insurancePremiumForElectricDevices(electricDevices), 300);
    }

    public void testElectricDeviceInsuranceNoExtraInsurance(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10);
        electricDevices[1] = new ElectricDevice("PC", 20);
        electricDevices[2] = new ElectricDevice("BigPC", 5000);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100);

        checkDouble("testElectricDeviceInsuranceNoExtraInsurance", premiumCalculator.insurancePremiumForElectricDevices(electricDevices), 0);
    }

    public void testPolicyInsuranceNoElectricDeviceInsuranceOneObject(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ObjectForPolicy [] objectsForPolicy = new ObjectForPolicy[1];
        objectsForPolicy[0] = new ObjectForPolicy();
        Policy policy = new Policy (objectsForPolicy);

        checkDouble("testPolicyInsuranceNoElectricDeviceInsuranceOneObject", premiumCalculator.calculate(policy), 0);
    }

    public void testPolicyInsuranceNoElectricDeviceInsuranceTwoObjects(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ObjectForPolicy [] objectsForPolicy = new ObjectForPolicy[2];
        objectsForPolicy[0] = new ObjectForPolicy();
        objectsForPolicy[1] = new ObjectForPolicy();
        Policy policy = new Policy (objectsForPolicy);

        checkDouble("testPolicyInsuranceNoElectricDeviceInsuranceTwoObjects", premiumCalculator.calculate(policy), 0);
    }

    public void testPolicyInsuranceWithElectricDevicesInsuranceOneObject(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10);
        electricDevices[1] = new ElectricDevice("PC", 20);
        electricDevices[2] = new ElectricDevice("BigPC", 5000);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100);

        ObjectForPolicy [] objectsForPolicy = new ObjectForPolicy[1];
        objectsForPolicy[0] = new ObjectForPolicy(electricDevices);
        Policy policy = new Policy (objectsForPolicy);

        checkDouble("testPolicyInsuranceWithElectricDevicesInsuranceOneObject", premiumCalculator.calculate(policy), 0);
    }

    public void testPolicyInsuranceWithElectricDevicesInsuranceTwoObjects(){
        PremiumCalculator premiumCalculator = new PremiumCalculator();

        ElectricDevice [] electricDevices = new ElectricDevice[5];
        electricDevices[0] = new ElectricDevice("TV", 10);
        electricDevices[1] = new ElectricDevice("PC", 20);
        electricDevices[2] = new ElectricDevice("BigPC", 5000);
        electricDevices[3] = new ElectricDevice("SmallTV", 30);
        electricDevices[4] = new ElectricDevice("Fridge", 100);

        ObjectForPolicy [] objectsForPolicy = new ObjectForPolicy[2];
        objectsForPolicy[0] = new ObjectForPolicy(electricDevices);
        objectsForPolicy[1] = new ObjectForPolicy();
        Policy policy = new Policy (objectsForPolicy);

        checkDouble("testPolicyInsuranceWithElectricDevicesInsuranceTwoObjects", premiumCalculator.calculate(policy), 0);
    }




}
