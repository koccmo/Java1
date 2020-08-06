package student_anvars_intezars.home_tasks.lesson_7.day_6.task11;

import java.sql.SQLOutput;

class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.testForCreditCardWithdraw();
        creditCardTest.testForCreditCardDeposit();
    }

    public void testForCreditCardWithdraw() {
        CreditCard creditCard = new CreditCard(77335591, 8978);
        int withdrawResult = creditCard.withdraw(8978, 100);
        if (withdrawResult == 900) {
            System.out.println("Test for withdraw = OK");
            System.out.println();
        }else {
            System.out.println("Test for withdraw = FAIL");
        }
    }

    public void testForCreditCardDeposit() {
        CreditCard creditCard = new CreditCard(77335591,8978);
        int depositResult = creditCard.deposit(8978,15);
        if (depositResult == 15) { System.out.println();
            System.out.println("Test for deposit = OK");
        }else {
            System.out.println("Test for deposit = FAIL");
        }
    }
}

