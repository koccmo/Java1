package student_valerija_ionova.lesson_9.level_6;

class FraudDetectorTest {

    public static void main(String [] args){

        FraudDetectorTest test = new FraudDetectorTest();

        test.testRule1();
        test.testRule1RuleName();

        test.testRule2();
        test.testRule2RuleName();

        test.testRule3();
        test.testRule3RuleName();

        test.testRule4();
        test.testRule4RuleName();

        test.testRule5();
        test.testRule5RuleName();
        test.testRule5False();
        test.testRule2Rule5RuleName();

    }

    void checkResult (String name, boolean testResult){
        if (testResult){
            System.out.println(name+" OK\n");
        }else{
            System.out.println(name+" FAIL\n");
        }
    }

    void testRule1(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction (trader, 100);

        checkResult("testRule1",detector.isFraud(transaction).getFraud());
    }

    void testRule1RuleName(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Pokemon", "Riga");
        Transaction transaction = new Transaction (trader, 100);

        checkResult("testRule1RuleName",detector.isFraud(transaction).getRuleName().get(0).equals("rule1"));
    }

    void testRule2(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Batman", "Riga");
        Transaction transaction = new Transaction (trader, 1000001);

        checkResult("testRule2",detector.isFraud(transaction).getFraud());
    }

    void testRule2RuleName(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Batman", "Riga");
        Transaction transaction = new Transaction (trader, 1000001);

        checkResult("testRule2RuleName",detector.isFraud(transaction).getRuleName().get(0).equals("rule2"));
    }

    void testRule3(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Batman", "Sydney");
        Transaction transaction = new Transaction (trader, 10001);

        checkResult("testRule3",detector.isFraud(transaction).getFraud());
    }

    void testRule3RuleName(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Batman", "Sydney");
        Transaction transaction = new Transaction (trader, 10001);

        checkResult("testRule3RuleName",detector.isFraud(transaction).getRuleName().get(0).equals("rule3"));
    }

    void testRule4(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Batman", "Jamaica");
        Transaction transaction = new Transaction (trader, 10001);

        checkResult("testRule4",detector.isFraud(transaction).getFraud());
    }

    void testRule4RuleName(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Batman", "Jamaica");
        Transaction transaction = new Transaction (trader, 10001);

        checkResult("testRule4RuleName",detector.isFraud(transaction).getRuleName().get(0).equals("rule4"));
    }

    void testRule5(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Batman", "German");
        Transaction transaction = new Transaction (trader, 10001);

        checkResult("testRule5",detector.isFraud(transaction).getFraud());
    }

    void testRule5RuleName(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Batman", "German");
        Transaction transaction = new Transaction (trader, 10001);

        checkResult("testRule5RuleName",detector.isFraud(transaction).getRuleName().get(0).equals("rule5"));
    }

    void testRule5False(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Batman", "German");
        Transaction transaction = new Transaction (trader, 101);

        checkResult("testRule5False",!detector.isFraud(transaction).getFraud());
    }

    void testRule2Rule5RuleName(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule1"), new FraudRule2("rule2"), new FraudRule3("rule3"), new FraudRule4("rule4"), new FraudRule5("rule5"));

        Trader trader = new Trader("Batman", "German");
        Transaction transaction = new Transaction (trader, 1000009);

        checkResult("testRule2Rule5RuleName",detector.isFraud(transaction).getRuleName().get(0).equals("rule2") && detector.isFraud(transaction).getRuleName().get(1).equals("rule5"));
    }


}
