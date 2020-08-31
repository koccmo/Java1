package student_anvars_intezars.home_tasks.lesson_9.level_6;

class TraderTest {

    public static void main(String[] args) {

        TraderTest traderTest = new TraderTest();
        traderTest.ruleArrayTestForFraud1();
        traderTest.ruleArrayTestForFraud2();
        traderTest.ruleArrayTestForFraud3();
        traderTest.ruleArrayTestForFraud4();
        traderTest.ruleArrayTestForFraud5();
    }


    void ruleArrayTestForFraud1() {
        Trader trader1 = new Trader("Pokemon","Riga","Latvia");
        FraudRule[] fraudRules = new FraudRule[5];
        FraudRule1 fraudRule1 = new FraudRule1("Find Pokemon");
        FraudRule2 fraudRule2 = new FraudRule2("Find amount > 1000000");
        FraudRule3 fraudRule3 = new FraudRule3("Find fraud by city");
        FraudRule4 fraudRule4 = new FraudRule4("Find fraud by country");
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country and amount");
        fraudRules[0] = fraudRule1;
        fraudRules[1] = fraudRule2;
        fraudRules[2] = fraudRule3;
        fraudRules[3] = fraudRule4;
        fraudRules[4] = fraudRule5;
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();
        fraudDetectionResult  = fraudDetector.isFraud(trader1,10043);
        if(fraudDetectionResult.getFraud()) {
            System.out.println("Test1 for detecting Fraud with array of rules = OK");
            System.out.println("Fraud type is " + fraudDetectionResult.getRuleName());
            System.out.println();
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
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country and amount");
        fraudRules[0] = fraudRule1;
        fraudRules[1] = fraudRule2;
        fraudRules[2] = fraudRule3;
        fraudRules[3] = fraudRule4;
        fraudRules[4] = fraudRule5;
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();
        fraudDetectionResult = fraudDetector.isFraud(trader1,1000001);
        if(fraudDetectionResult.getFraud()) {
            System.out.println("Test2 for detecting Fraud with array of rules = OK");
            System.out.println("Fraud type is " + fraudDetectionResult.getRuleName());
            System.out.println();
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
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country and amount");
        fraudRules[0] = fraudRule1;
        fraudRules[1] = fraudRule2;
        fraudRules[2] = fraudRule3;
        fraudRules[3] = fraudRule4;
        fraudRules[4] = fraudRule5;
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();
        fraudDetectionResult = fraudDetector.isFraud(trader1,1000001);
        if(fraudDetectionResult.getFraud()) {
            System.out.println("Test3 for detecting Fraud with array of rules = OK");
            System.out.println("Fraud type is " + fraudDetectionResult.getRuleName());
            System.out.println();
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
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country and amount");
        fraudRules[0] = fraudRule1;
        fraudRules[1] = fraudRule2;
        fraudRules[2] = fraudRule3;
        fraudRules[3] = fraudRule4;
        fraudRules[4] = fraudRule5;
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();
        fraudDetectionResult = fraudDetector.isFraud(trader1,1000);
        if(fraudDetectionResult.getFraud()) {
            System.out.println("Test4 for detecting Fraud with array of rules = OK");
            System.out.println("Fraud type is " + fraudDetectionResult.getRuleName());
            System.out.println();
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
        FraudRule5 fraudRule5 = new FraudRule5("Find fraud by country and amount");
        fraudRules[0] = fraudRule1;
        fraudRules[1] = fraudRule2;
        fraudRules[2] = fraudRule3;
        fraudRules[3] = fraudRule4;
        fraudRules[4] = fraudRule5;
        FraudDetector fraudDetector = new FraudDetector(fraudRules);
        FraudDetectionResult fraudDetectionResult = new FraudDetectionResult();
        fraudDetectionResult = fraudDetector.isFraud(trader1,1001);
        if(fraudDetectionResult.getFraud()) {
            System.out.println("Test4 for detecting Fraud with array of rules = OK");
            System.out.println("Fraud type is " + fraudDetectionResult.getRuleName());
            System.out.println();
        } else {
            System.out.println("Test4 for detecting Fraud with array of rules = FAIL");
        }
    }
}


