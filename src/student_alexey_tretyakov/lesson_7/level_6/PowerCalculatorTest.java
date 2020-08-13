package student_alexey_tretyakov.lesson_7.level_6;

class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.testIntPower();
        powerCalculatorTest.testIntNegativePower();
        powerCalculatorTest.testZeroPower();
        powerCalculatorTest.testFractionalBaseIntPower();
        powerCalculatorTest.testFractionalBaseNegativePower();
        powerCalculatorTest.testFractionalBaseZeroPower();
    }

    private void testIntPower(){
        PowerCalculator powerCalculator = new PowerCalculator(5,2);
        double result = powerCalculator.calculatePower();
        testResult( "Int base and int power.",result == 25);
    }

    private void testIntNegativePower(){
        PowerCalculator powerCalculator = new PowerCalculator(4,-1);
        double result = powerCalculator.calculatePower();
        testResult( "Int base and int negative power.",result == 0.25);
    }

    private void testZeroPower(){
        PowerCalculator powerCalculator = new PowerCalculator(5,0);
        double result = powerCalculator.calculatePower();
        testResult( "Int base and zero power.",result == 1);
    }

    private void testFractionalBaseIntPower(){
        PowerCalculator powerCalculator = new PowerCalculator(.2,4);
        double result = powerCalculator.calculatePower();
        testResult( "Fractional base and int  power.",result == 0.0016);
    }

    private void testFractionalBaseNegativePower(){
        PowerCalculator powerCalculator = new PowerCalculator(.25,-2);
        double result = powerCalculator.calculatePower();
        testResult( "Fractional base and negative power.",result == 16);
    }

    private void testFractionalBaseZeroPower(){
        PowerCalculator powerCalculator = new PowerCalculator(.25,0);
        double result = powerCalculator.calculatePower();
        testResult( "Fractional base and zero power.",result == 1);
    }

    private void testResult( String testName, boolean testStatus) {
        if ( testStatus ) {
            System.out.println( testName + " Test OK.");
        } else {
            System.out.println( testName + " Test FAIL!!!");
        }
    }
}
