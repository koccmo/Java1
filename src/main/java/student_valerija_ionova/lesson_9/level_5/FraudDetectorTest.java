package student_valerija_ionova.lesson_9.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudDetectorTest {

    public static void main(String [] args){

        FraudDetectorTest test = new FraudDetectorTest();

        test.testRule1();
        test.testRule2();
        test.testRule3();
        test.testRule4();
        test.testRule5();
        test.testRule5False();

    }

    void checkResult (String name, boolean testResult){
        if (testResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testRule1(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule"), new FraudRule2("rule"), new FraudRule3("rule"), new FraudRule4("rule"), new FraudRule5("rule"));

        Trader trader = new Trader("Pokemon", "Riga", "Latvia");
        Transaction transaction = new Transaction (trader, 100);

        checkResult("testRule1",detector.isFraud(transaction) == true);
    }

    void testRule2(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule"), new FraudRule2("rule"), new FraudRule3("rule"), new FraudRule4("rule"), new FraudRule5("rule"));

        Trader trader = new Trader("Batman", "Riga", "Latvia");
        Transaction transaction = new Transaction (trader, 1000001);

        checkResult("testRule2",detector.isFraud(transaction) == true);
    }

    void testRule3(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule"), new FraudRule2("rule"), new FraudRule3("rule"), new FraudRule4("rule"), new FraudRule5("rule"));

        Trader trader = new Trader("Batman", "Sydney", "Latvia");
        Transaction transaction = new Transaction (trader, 10001);

        checkResult("testRule3",detector.isFraud(transaction) == true);
    }

    void testRule4(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule"), new FraudRule2("rule"), new FraudRule3("rule"), new FraudRule4("rule"), new FraudRule5("rule"));

        Trader trader = new Trader("Batman", "Riga", "Jamaica");
        Transaction transaction = new Transaction (trader, 10001);

        checkResult("testRule4",detector.isFraud(transaction) == true);
    }

    void testRule5(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule"), new FraudRule2("rule"), new FraudRule3("rule"), new FraudRule4("rule"), new FraudRule5("rule"));

        Trader trader = new Trader("Batman", "German", "Latvia");
        Transaction transaction = new Transaction (trader, 10001);

        checkResult("testRule5",detector.isFraud(transaction) == true);
    }

    void testRule5False(){

        FraudDetector detector = new FraudDetector (new FraudRule1("rule"), new FraudRule2("rule"), new FraudRule3("rule"), new FraudRule4("rule"), new FraudRule5("rule"));

        Trader trader = new Trader("Batman", "German", "Latvia");
        Transaction transaction = new Transaction (trader, 101);

        checkResult("testRule5False",detector.isFraud(transaction) == false);
    }


}
