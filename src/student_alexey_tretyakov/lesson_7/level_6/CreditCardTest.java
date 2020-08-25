package student_alexey_tretyakov.lesson_7.level_6;


import java.math.BigDecimal;

class CreditCardTest  {


    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.creditCardNumberTest();
        creditCardTest.creditCardPinTest();
        creditCardTest.depositCreditCardTest();
        creditCardTest.withdrawCreditCardTest();


    }

    private void creditCardNumberTest (){
        CreditCard creditCard = new CreditCard ("1234123412341234",5678);
        testResult("Check number credit card.",(creditCard.getCardNumber().equals("1234123412341234")) );
    }
    private void creditCardPinTest (){
        CreditCard creditCard = new CreditCard ("1234123412341234",5678);
        testResult("Check pin number credit card.",(creditCard.getCardPin() == 5678) );
    }
    private void depositCreditCardTest (){
        CreditCard creditCard = new CreditCard ("1234123412341234",5678);
        creditCard.depositCreditCard(5678,new BigDecimal(150));
        BigDecimal testSum = new BigDecimal(150);
        testResult("Deposit operation credit card.", (creditCard.getCardBalance().compareTo ( testSum ) == 0 ) );
    }
    private void withdrawCreditCardTest (){
        CreditCard creditCard = new CreditCard ("1234123412341234",5678);
        creditCard.depositCreditCard(5678,new BigDecimal(150));
        creditCard.setCardCreditLimit( new BigDecimal(100));
        creditCard.withdrawCreditCard(5678,new BigDecimal(230));
        BigDecimal testSum = new BigDecimal(80);
        testResult("Withdraw operation credit card.", (creditCard.getCardCredit().compareTo ( testSum ) == 0 ) );
    }



    private void testResult( String testName, boolean testStatus) {
        if ( testStatus ) {
            System.out.println( testName + " Test OK.");
        } else {
            System.out.println( testName + " Test FAIL!!!");
        }
    }
}
