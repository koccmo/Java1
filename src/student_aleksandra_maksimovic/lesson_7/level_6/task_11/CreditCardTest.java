package student_aleksandra_maksimovic.lesson_7.level_6.task_11;

import student_aleksandra_maksimovic.testing.Tester;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();

        test.depositTestIncorrectPinCode();
        test.withdrawTest();
        test.withdrawTest2();
        test.depositTest();
    }


    Tester tester = new Tester();

    public void depositTestIncorrectPinCode() {
        CreditCard creditCard = new CreditCard("5892", "4444");
        boolean transactionSuccessful = creditCard.deposit("4422", 100);
        tester.check(!transactionSuccessful, "deposit test");
    }

    public void withdrawTest() {
        CreditCard creditCard = new CreditCard("5892", "4444");
        creditCard.setBalance(0);
        creditCard.setCreditLimit(100);
        creditCard.setCreditLoan(0);
        boolean transactionSuccessful = creditCard.withdraw("4444",100);
        tester.check(transactionSuccessful, "withDraw test");

    }

    public void withdrawTest2() {
        CreditCard creditCard = new CreditCard("5892", "4444");
        creditCard.setBalance(0);
        creditCard.setCreditLimit(10);
        creditCard.setCreditLoan(0);
        boolean transactionSuccessful = creditCard.withdraw("4444", 50);
        tester.check(!transactionSuccessful, "Withdraw test #2");
    }
    public void depositTest() {
        CreditCard creditCard = new CreditCard("5892", "4444");
        creditCard.setCreditLoan(150);
        boolean transactionSuccessful = creditCard.deposit("4444", 160);
        tester.check(creditCard.getBalance() == 10 && creditCard.getCreditLoan() == 0 , "Deposit test");
    }

}