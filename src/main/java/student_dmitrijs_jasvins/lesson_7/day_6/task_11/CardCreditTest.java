package student_dmitrijs_jasvins.lesson_7.day_6.task_11;

import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CardCreditTest {
    public static void main(String[] args) {
        CardCreditTest cardCreditTest = new CardCreditTest();
        cardCreditTest.shouldNotDepositWithIncorrectPinCode();
        cardCreditTest.shouldNotWithdrawWithIncorrectPinCode();
        cardCreditTest.shouldWithdrawWithSufficientBalance();
        cardCreditTest.shouldWithdrawWithInsufficientBalanceAndLoanIsSmallerThanLoanLimit();
        cardCreditTest.shouldWithdrawWithInsufficientBalanceAndLoanIsLargerThanLoanLimit();
        cardCreditTest.shouldDepositWhenCreditLoanIsZero();
        cardCreditTest.shouldDepositWhenLoanIsLargerThanDepositAmount();
        cardCreditTest.shouldDepositWhenCreditLoanIsSmallerThanDepositAmount();

    }

    public void shouldNotDepositWithIncorrectPinCode() {
        CreditCard creditCard = new CreditCard("5505", "1234");
        boolean transactionSucceed = creditCard.deposit("4321", BigDecimal.valueOf(100));
        if (!transactionSucceed) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    public void shouldNotWithdrawWithIncorrectPinCode() {
        CreditCard creditCard = new CreditCard("5505", "1234");
        boolean transactionSucceed = creditCard.withdraw("4321", BigDecimal.valueOf(50));
        if (!transactionSucceed) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    public void shouldWithdrawWithSufficientBalance() {
        CreditCard creditCard = new CreditCard("5505", "1234");
        creditCard.setBalance(BigDecimal.valueOf(50));
        boolean transactionSucceed = creditCard.withdraw("1234", BigDecimal.valueOf(25));
        if (transactionSucceed) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    public void shouldWithdrawWithInsufficientBalanceAndLoanIsSmallerThanLoanLimit() {
        CreditCard creditCard = new CreditCard("5505", "1234");
        creditCard.setCreditLimit(BigDecimal.valueOf(50));
        boolean transactionSucceed = creditCard.withdraw("1234", BigDecimal.valueOf(25));
        if (transactionSucceed) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }

    public void shouldWithdrawWithInsufficientBalanceAndLoanIsLargerThanLoanLimit() {
        CreditCard creditCard = new CreditCard("5505", "1234");
        creditCard.setCreditLoan(BigDecimal.valueOf(50));
        creditCard.setCreditLimit(BigDecimal.valueOf(50));
        boolean transactionSucceed = creditCard.withdraw("1234", BigDecimal.valueOf(25));
        if (!transactionSucceed) {
            System.out.println("Test 5 = OK");
        } else {
            System.out.println("Test 5 = FAIL");
        }
    }

    public void shouldDepositWhenCreditLoanIsZero() {
        CreditCard creditCard = new CreditCard("5505", "1234");
        boolean transactionSucceed = creditCard.deposit("1234", BigDecimal.valueOf(25));
        if (transactionSucceed) {
            System.out.println("Test 6 = OK");
        } else {
            System.out.println("Test 6 = FAIL");
        }
    }

    public void shouldDepositWhenLoanIsLargerThanDepositAmount() {
        CreditCard creditCard = new CreditCard("5505", "1234");
        creditCard.setCreditLoan(BigDecimal.valueOf(50));
        boolean transactionSucceed = creditCard.deposit("1234", BigDecimal.valueOf(25));
        if (transactionSucceed) {
            System.out.println("Test 7 = OK");
        } else {
            System.out.println("Test 7 = FAIL");
        }
    }

    public void shouldDepositWhenCreditLoanIsSmallerThanDepositAmount() {
        CreditCard creditCard = new CreditCard("5505", "1234");
        creditCard.setCreditLoan(BigDecimal.valueOf(50));
        boolean transactionSucceed = creditCard.deposit("1234", BigDecimal.valueOf(100));
        if (transactionSucceed) {
            System.out.println("Test 8 = OK");
        } else {
            System.out.println("Test 8 = FAIL");
        }
    }

}
