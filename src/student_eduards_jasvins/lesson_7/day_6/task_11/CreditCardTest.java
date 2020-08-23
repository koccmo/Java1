package student_eduards_jasvins.lesson_7.day_6.task_11;

import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.depositMoneySuccess();
        creditCardTest.depositMoneyNotSuccess();
        creditCardTest.withdrawMoneySuccess();
        creditCardTest.withdrawMoneyNotSuccess();
        creditCardTest.withdrawMoneyNotSuccessWithLoan();
    }

    public void depositMoneySuccess() {
        CreditCard creditCard = new CreditCard();
        creditCard.creditCard("8881 4431 9990 4132", "2415");
        boolean transactionSuccess = creditCard.deposit("2415", BigDecimal.valueOf(100));
        if (transactionSuccess) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    public void depositMoneyNotSuccess() {
        CreditCard creditCard = new CreditCard();
        creditCard.creditCard("8881 4431 9990 4132", "2415");
        boolean transactionSuccess = creditCard.deposit("2414", BigDecimal.valueOf(100));
        if (!transactionSuccess) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    public void withdrawMoneySuccess() {
        CreditCard creditCard = new CreditCard();
        creditCard.creditCard("1345 5612 4513 5112", "5541");
        creditCard.setBalance(BigDecimal.valueOf(25));
        boolean transactionSuccess = creditCard.withdraw("5541", BigDecimal.valueOf(10));
        if (transactionSuccess) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    public void withdrawMoneyNotSuccess() {
        CreditCard creditCard = new CreditCard();
        creditCard.creditCard("1345 5612 4513 5112", "5541");
        creditCard.setBalance(BigDecimal.valueOf(25));
        boolean transactionSuccess = creditCard.withdraw("5541", BigDecimal.valueOf(30));
        if (!transactionSuccess) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }

    public void withdrawMoneyNotSuccessWithLoan() {
        CreditCard creditCard = new CreditCard();
        creditCard.creditCard("1345 5612 4513 5112", "5541");
        creditCard.setCreditLimit(BigDecimal.valueOf(50));
        creditCard.setLoanDebt(BigDecimal.valueOf(50));
        boolean transactionSuccess = creditCard.withdraw("5541", BigDecimal.valueOf(30));
        if (!transactionSuccess) {
            System.out.println("Test 5 = OK");
        } else {
            System.out.println("Test 5 = FAIL");
        }
    }



}
