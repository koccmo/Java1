package student_igors_bartkevics.lesson_7.homework.level_6.task_11;

import java.math.BigDecimal;

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();
        test.creditRequestTest();
        test.depositPINTest();
        test.depositTestWithNoLoanDebt();
        test.depositTestWithLoanDebtCover();
        test.depositTestWithLoanDebt();
        test.withdrawalPINTest();
        test.isValueOfWithdrawalOkTest();
        test.withdrawalTestWithNoLoanDebt();
        test.withdrawalTestWithLoanDebt();
    }

    public void withdrawalTestWithLoanDebt() {
        int[] pinCode = {0, 0, 0, 0};
        CreditCard creditCard = new CreditCard(1, pinCode);
        creditCard.setBalance(new BigDecimal("200.00"));
        creditCard.withdrawal(pinCode, new BigDecimal("300.00"));

        boolean condition = (creditCard.getBalance().compareTo(new BigDecimal("0.00")) == 0) &&
                (creditCard.getLoanDebt().compareTo(new BigDecimal("100.00")) == 0);
        checkResult(condition, "Withdrawal test with loan debt");
    }

    public void withdrawalTestWithNoLoanDebt() {
        int[] pinCode = {0, 0, 0, 0};
        CreditCard creditCard = new CreditCard(1, pinCode);
        creditCard.setBalance(new BigDecimal("200"));
        creditCard.withdrawal(pinCode, new BigDecimal("100"));
        boolean condition = creditCard.getBalance().compareTo(new BigDecimal("100")) == 0;
        checkResult(condition, "Withdrawal test with no loan debt");
    }

    public void isValueOfWithdrawalOkTest() {
        int[] pinCode = {0, 0, 0, 0};
        CreditCard creditCard = new CreditCard(1, pinCode);
        boolean condition1 = creditCard.isValueOfWithdrawalOk(new BigDecimal("1000"));
        checkResult(condition1, "Value of withdrawal is ok");
        boolean condition2 = !creditCard.isValueOfWithdrawalOk(new BigDecimal("1005"));
        checkResult(condition2, "Value of withdrawal is NOT ok");
    }

    public void withdrawalPINTest() {
        int[] pinCode = {0, 0, 0, 0};
        int[] wrongPin = {1, 1, 1, 1};
        CreditCard creditCard = new CreditCard(1, pinCode);
        boolean condition1 = !creditCard.withdrawal(wrongPin, new BigDecimal("100"));
        checkResult(condition1, "Withdrawal test wrong pin");
        boolean condition2 = creditCard.withdrawal(pinCode, new BigDecimal("100"));
        checkResult(condition2, "Withdrawal test right pin");
    }

    public void depositTestWithLoanDebt() {
        int[] pinCode = {0, 0, 0, 0};
        CreditCard creditCard = new CreditCard(1, pinCode);
        creditCard.setLoanDebt(new BigDecimal("40.00"));
        creditCard.deposit(pinCode, new BigDecimal("20.00"));

        boolean condition = (creditCard.getBalance().compareTo(new BigDecimal("0.00")) == 0) &&
                (creditCard.getLoanDebt().compareTo(new BigDecimal("20")) == 0);
        checkResult(condition, "Deposit test with loan debt");
    }

    public void depositTestWithLoanDebtCover() {
        int[] pinCode = {0, 0, 0, 0};
        CreditCard creditCard = new CreditCard(1, pinCode);
        creditCard.setLoanDebt(new BigDecimal("40.00"));

        creditCard.deposit(pinCode, new BigDecimal("100.00"));
        boolean condition = (creditCard.getBalance().compareTo(new BigDecimal("60")) == 0) &&
                (creditCard.getLoanDebt().compareTo(BigDecimal.ZERO) == 0);
        checkResult(condition, "Deposit test with loan debt cover");
    }

    public void depositTestWithNoLoanDebt() {
        int[] pinCode = {0, 0, 0, 0};
        CreditCard creditCard = new CreditCard(1, pinCode);
        creditCard.deposit(pinCode, new BigDecimal("100"));
        boolean condition1 = creditCard.getBalance().compareTo(new BigDecimal("100")) == 0;
        checkResult(condition1, "Deposit test with no loan debt");
    }

    public void depositPINTest() {
        int[] pinCode = {0, 0, 0, 0};
        int[] wrongPin = {1, 1, 1, 1};
        CreditCard creditCard = new CreditCard(1, pinCode);
        boolean condition1 = !creditCard.deposit(wrongPin, new BigDecimal("100"));
        checkResult(condition1, "Deposit test wrong pin");
        boolean condition2 = creditCard.deposit(pinCode, new BigDecimal("100"));
        checkResult(condition2, "Deposit test right pin");
    }

    public void creditRequestTest() {
        int[] pinCode = {0, 0, 0, 0};
        CreditCard creditCard = new CreditCard(1, pinCode);
        creditCard.setBalance(new BigDecimal("100.00"));
        boolean condition1 = creditCard.creditRequest(new BigDecimal("200.00")).compareTo(new BigDecimal("100.00")) == 0;
        checkResult(condition1, "Credit Request of 100.00 ");
        boolean condition2 = creditCard.creditRequest(new BigDecimal("100.00")).compareTo(new BigDecimal("0.00")) == 0;
        checkResult(condition2, "Credit Request of 0.00 withdrawal value equals balance");
        boolean condition3 = creditCard.creditRequest(new BigDecimal("50.00")).compareTo(new BigDecimal("0.00")) == 0;
        checkResult(condition3, "Credit Request of 0.00 withdrawal value less than balance");
    }
    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
