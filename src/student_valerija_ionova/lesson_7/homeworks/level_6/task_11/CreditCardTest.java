package student_valerija_ionova.lesson_7.homeworks.level_6.task_11;

class CreditCardTest {

    public static void main (String [] args){
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.testNewCardNumber();
        creditCardTest.testNewCardPinCode();
        creditCardTest.testChangeOfCreditLimit();
        creditCardTest.testWithdrawNoMoney();
        creditCardTest.testWithdrawNotCorrectPinCode();
        creditCardTest.testDepositNotCorrectPinCode();
        creditCardTest.testDepositUpdatedCardsBalance();
        creditCardTest.testDepositCorrectPinCodeTrue();
        creditCardTest.testDepositForCardsBalanceIfUsedCredit();
        creditCardTest.testOfDepositForCreditBalanceWithoutCredit();
        creditCardTest.testDepositForCreditBalanceUsedCredit();
        creditCardTest.testDepositForCreditBalanceManyOperations();

    }

    public void printResultOfTest(String name,boolean ifTestPassed){
        if (ifTestPassed){
            System.out.println(name+" OK\n");
        }else{
            System.out.println(name+" FAIL\n");
        }
    }

    public void checkString(String name, String methodsResult, String expectedResult){
        printResultOfTest(name, methodsResult.equals(expectedResult));
    }

    public void checkInt(String name, int methodsResult, int expectedResult){
        printResultOfTest(name, methodsResult == expectedResult);
    }

    public void checkDouble(String name, double methodsResult, double expectedResult){
        printResultOfTest(name, methodsResult == expectedResult);
    }

    public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
        printResultOfTest(name, methodsResult == expectedResult);
    }

    public void testNewCardNumber(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        checkString("testNewCardNumber", bobbysCreditCard.getCardsNumber(), "1234567890");
    }

    public void testNewCardPinCode(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        checkInt("testNewCardPinCode", bobbysCreditCard.getPinCode(), 1234);
    }

    public void testChangeOfCreditLimit(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        bobbysCreditCard.changeCreditLimit(100);
        checkDouble("testChangeOfCreditLimit", bobbysCreditCard.getCreditLimit(), 100);
    }

    public void testWithdrawNoMoney(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        checkBoolean("testWithdrawNoMoney", bobbysCreditCard.withdraw(1234, 5), false);
    }

    public void testWithdrawNotCorrectPinCode(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        checkBoolean("testWithdrawNotCorrectPinCode", bobbysCreditCard.withdraw(1334, 0), false);
    }

    public void testDepositNotCorrectPinCode(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        checkBoolean("testDepositNotCorrectPinCode", bobbysCreditCard.deposit(1334, 10), false);
    }

    public void testDepositCorrectPinCodeTrue(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        checkBoolean("testDepositCorrectPinCodeTrue", bobbysCreditCard.deposit(1234, 10), true);
    }

    public void testDepositUpdatedCardsBalance(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        bobbysCreditCard.deposit(1234, 10);
        checkDouble("testDepositUpdatedCardsBalance", bobbysCreditCard.getBalance(), 10);
    }

    public void testOfDepositForCreditBalanceWithoutCredit(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        bobbysCreditCard.deposit(1234, 10);
        checkDouble("testOfDepositForCreditBalanceWithoutCredit", bobbysCreditCard.getCreditBalance(), 0);
    }

    public void testDepositForCardsBalanceIfUsedCredit(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        bobbysCreditCard.changeCreditLimit(50);
        bobbysCreditCard.withdraw(1234, 40);
        bobbysCreditCard.deposit(1234, 10);
        checkDouble("testDepositForCardsBalanceIfUsedCredit", bobbysCreditCard.getBalance(), 0);
    }

    public void testDepositForCreditBalanceUsedCredit(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);
        bobbysCreditCard.changeCreditLimit(50);
        bobbysCreditCard.withdraw(1234, 40);

        bobbysCreditCard.deposit(1234, 10);
        checkDouble("testDepositForCreditBalanceUsedCredit", bobbysCreditCard.getCreditBalance(), 20);
    }

    public void testDepositForCreditBalanceManyOperations(){
        CreditCard bobbysCreditCard = new CreditCard("1234567890", 1234);

        bobbysCreditCard.changeCreditLimit(50);

        bobbysCreditCard.withdraw(1234, 20);//-20

        bobbysCreditCard.deposit(1234, 50);//+30

        bobbysCreditCard.deposit(1234, 100);//130

        checkDouble("testDepositForCreditBalanceManyOperations", bobbysCreditCard.getBalance(), 130);
    }

}
