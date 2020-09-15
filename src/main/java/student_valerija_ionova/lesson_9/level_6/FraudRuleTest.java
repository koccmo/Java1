package student_valerija_ionova.lesson_9.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRuleTest {

    public static void main (String [] args){

        FraudRuleTest test = new FraudRuleTest();

        test.testRule1True();
        test.testRule1False();
        test.testRule2True();
        test.testRule3();
        test.testRule4();
        test.testRule5GermanAnd1000();
        test.testRule5GermanLessThan1000();

    }

    void checkResult(String name, boolean testsResult){
        if (testsResult){
            System.out.println(name+" OK");
        }else{
            System.out.println(name+" FAIL");
        }
    }

    void testRule1True(){
        FraudRule1 rule1 = new FraudRule1("FraudRule1");
        Trader pokemon = new Trader ("Pokemon", "New York");
        Transaction t = new Transaction(pokemon, 100);

        checkResult("testRule1True", rule1.isFraud(t) == true);
    }

    void testRule1False(){

        FraudRule1 rule1 = new FraudRule1("FraudRule1");
        Trader trader = new Trader ("PokyMan", "New York");
        Transaction t = new Transaction(trader, 100);

        checkResult("testRule1False", rule1.isFraud(t) == false);

    }

    void testRule2True(){

        FraudRule2 rule2 = new FraudRule2("FraudRule2");
        Trader trader = new Trader ("Bob", "New York");
        Transaction t = new Transaction(trader, 1000008);

        checkResult("testRule2True", rule2.isFraud(t) == true);
    }

    void testRule3(){

        FraudRule3 rule3 = new FraudRule3("FraudRule3");
        Trader trader = new Trader ("Bob", "Sydney");
        Transaction t = new Transaction(trader, 10008);

        checkResult("testRule3", rule3.isFraud(t) == true);
    }

    void testRule4(){

        FraudRule4 rule4 = new FraudRule4("FraudRule4");
        Trader trader = new Trader ("Bob", "Jamaica");
        Transaction t = new Transaction(trader, 10008);

        checkResult("testRule4", rule4.isFraud(t) == true);
    }

    void testRule5GermanAnd1000(){

        FraudRule5 rule5 = new FraudRule5("FraudRule5");
        Trader trader = new Trader ("Bob", "German");
        Transaction t = new Transaction(trader, 10008);

        checkResult("testRule5", rule5.isFraud(t) == true);
    }

    void testRule5GermanLessThan1000(){

        FraudRule5 rule5 = new FraudRule5("FraudRule5");
        Trader trader = new Trader ("Bob", "German");
        Transaction t = new Transaction(trader, 108);

        checkResult("testRule5GermanLessThan1000", rule5.isFraud(t) == false);
    }

}
