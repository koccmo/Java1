package student_anvars_intezars.home_tasks.lesson_9.level_5;

class TraderTest {

    public static void main(String[] args) {

        TraderTest traderTest = new TraderTest();
        traderTest.rule1TestForFraud();
        traderTest.rule2TestForFraud();
        traderTest.rule3TestForFraud();
        traderTest.rule4TestForFraud();
        traderTest.rule5TestForFraud();
    }



    void rule1TestForFraud() {
        Trader sixthTrader = new Trader("Pokemon","Sochi","Russia Federation");
        FraudRule1 fraudRule1 = new FraudRule1("Find Pokemon");
        boolean result = fraudRule1.isFraud(sixthTrader,1000);
        if (result) {
            System.out.println("Test for Rule1 = OK");
        } else {
            System.out.println("Test for Rule = FAIL");
        }
    }

    void rule2TestForFraud() {
        Trader seventhTrader = new Trader("Petja","Riga","Latvia");
        FraudRule2 fraudRule2 = new FraudRule2("Find amount > 1000000");
        boolean result = fraudRule2.isFraud(seventhTrader,1000001);
        if (result) {
            System.out.println("Test for Rule2 = OK");
        } else {
            System.out.println("Test for RUle2 = FAIL");
        }
    }

    void rule3TestForFraud() {
        Trader eighthTrader = new Trader("Sunny","Sidney","Canada");
        FraudRule3 fraudRule3 = new FraudRule3("Find fraud by city");
        boolean result = fraudRule3.isFraud(eighthTrader,1000);
        if (result) {
            System.out.println("Test for Rule3 = OK");
        } else {
            System.out.println("Test for Rule3 = FAIL");
        }
    }

    void rule4TestForFraud(){
        Trader ninthTrader = new Trader("Afanasij","Riga","Jamaica");
        FraudRule4 fraudRule4 = new FraudRule4("Find fraud by country");
        boolean result = fraudRule4.isFraud(ninthTrader,57575);
        if (result) {
            System.out.println("Test for Rule4 = OK");
        } else {
            System.out.println("Test for RUle4 = FAIL");
        }
    }

    void rule5TestForFraud() {
        Trader tenthTrader = new Trader("Anton","Berlin","Germany");
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country and amount");
        boolean result = fraudRule5.isFraud(tenthTrader,1001);
        if (result) {
            System.out.println("Test for Rule5 = OK");
        } else {
            System.out.println("Test for Rule5 = FAIL");
        }
    }
}


