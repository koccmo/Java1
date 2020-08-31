package student_anvars_intezars.home_tasks.lesson_9.level_5_6;

class TraderTest {

    public static void main(String[] args) {

        TraderTest traderTest = new TraderTest();
        traderTest.rule1TestForFraud();
        traderTest.rule2TestForFraud();
        traderTest.rule3TestForFraud();
        traderTest.rule4TestForFraud();
        traderTest.rule5TestForFraud();
        traderTest.ruleArrayTestForFraud1();
        traderTest.ruleArrayTestForFraud2();
        traderTest.ruleArrayTestForFraud3();
        traderTest.ruleArrayTestForFraud4();
        traderTest.ruleArrayTestForFraud5();
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

    void ruleArrayTestForFraud1() {
        Trader trader1 = new Trader("Pokemon","Riga","Latvia");
        FraudRule[] fraudRules = new FraudRule[5];
        FraudRule1 fraudRule1 = new FraudRule1("Find Pokemon");
        FraudRule2 fraudRule2 = new FraudRule2("Find amount > 1000000");
        FraudRule3 fraudRule3 = new FraudRule3("Find fraud by city");
        FraudRule4 fraudRule4 = new FraudRule4("Find fraud by country");
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country");
        fraudRules[0] = fraudRule1;
        fraudRules[1] = fraudRule2;
        fraudRules[2] = fraudRule3;
        fraudRules[3] = fraudRule4;
        fraudRules[4] = fraudRule5;
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        boolean result = fraudDetector.isFraud(trader1,10043);
        if(result) {
            System.out.println("Test1 for detecting Fraud with array of rules = OK");
        } else {
            System.out.println("Test1 for detecting Fraud with array of rules = FAIL");
        }
    }

    void ruleArrayTestForFraud2() {
        Trader trader1 = new Trader("Pikachu","Riga","Latvia");
        FraudRule[] fraudRules = new FraudRule[5];
        FraudRule1 fraudRule1 = new FraudRule1("Find Pokemon");
        FraudRule2 fraudRule2 = new FraudRule2("Find amount > 1000000");
        FraudRule3 fraudRule3 = new FraudRule3("Find fraud by city");
        FraudRule4 fraudRule4 = new FraudRule4("Find fraud by country");
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country");
        fraudRules[0] = fraudRule1;
        fraudRules[1] = fraudRule2;
        fraudRules[2] = fraudRule3;
        fraudRules[3] = fraudRule4;
        fraudRules[4] = fraudRule5;
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        boolean result = fraudDetector.isFraud(trader1,1000001);
        if(result) {
            System.out.println("Test2 for detecting Fraud with array of rules = OK");
        } else {
            System.out.println("Test2 for detecting Fraud with array of rules = FAIL");
        }
    }

    void ruleArrayTestForFraud3() {
        Trader trader1 = new Trader("Pikachu","Sidney","Canada");
        FraudRule[] fraudRules = new FraudRule[5];
        FraudRule1 fraudRule1 = new FraudRule1("Find Pokemon");
        FraudRule2 fraudRule2 = new FraudRule2("Find amount > 1000000");
        FraudRule3 fraudRule3 = new FraudRule3("Find fraud by city");
        FraudRule4 fraudRule4 = new FraudRule4("Find fraud by country");
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country");
        fraudRules[0] = fraudRule1;
        fraudRules[1] = fraudRule2;
        fraudRules[2] = fraudRule3;
        fraudRules[3] = fraudRule4;
        fraudRules[4] = fraudRule5;
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        boolean result = fraudDetector.isFraud(trader1,1000001);
        if(result) {
            System.out.println("Test3 for detecting Fraud with array of rules = OK");
        } else {
            System.out.println("Test3 for detecting Fraud with array of rules = FAIL");
        }
    }

    void ruleArrayTestForFraud4() {
        Trader trader1 = new Trader("Pikachu","Riga","Jamaica");
        FraudRule[] fraudRules = new FraudRule[5];
        FraudRule1 fraudRule1 = new FraudRule1("Find Pokemon");
        FraudRule2 fraudRule2 = new FraudRule2("Find amount > 1000000");
        FraudRule3 fraudRule3 = new FraudRule3("Find fraud by city");
        FraudRule4 fraudRule4 = new FraudRule4("Find fraud by country");
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country");
        fraudRules[0] = fraudRule1;
        fraudRules[1] = fraudRule2;
        fraudRules[2] = fraudRule3;
        fraudRules[3] = fraudRule4;
        fraudRules[4] = fraudRule5;
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        boolean result = fraudDetector.isFraud(trader1,1000);
        if(result) {
            System.out.println("Test4 for detecting Fraud with array of rules = OK");
        } else {
            System.out.println("Test4 for detecting Fraud with array of rules = FAIL");
        }
    }

    void ruleArrayTestForFraud5() {
        Trader trader1 = new Trader("Pikachu","Riga","Germany");
        FraudRule[] fraudRules = new FraudRule[5];
        FraudRule1 fraudRule1 = new FraudRule1("Find Pokemon");
        FraudRule2 fraudRule2 = new FraudRule2("Find amount > 1000000");
        FraudRule3 fraudRule3 = new FraudRule3("Find fraud by city");
        FraudRule4 fraudRule4 = new FraudRule4("Find fraud by country");
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country");
        fraudRules[0] = fraudRule1;
        fraudRules[1] = fraudRule2;
        fraudRules[2] = fraudRule3;
        fraudRules[3] = fraudRule4;
        fraudRules[4] = fraudRule5;
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        boolean result = fraudDetector.isFraud(trader1,1001);
        if(result) {
            System.out.println("Test4 for detecting Fraud with array of rules = OK");
        } else {
            System.out.println("Test4 for detecting Fraud with array of rules = FAIL");
        }
    }
}


