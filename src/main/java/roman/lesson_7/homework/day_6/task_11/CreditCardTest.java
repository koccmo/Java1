package roman.lesson_7.homework.day_6.task_11;

import java.math.BigDecimal;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCardTest test = new CreditCardTest();

        test.noOverCreditLimitTest();
        test.creditRequiredTest();
        test.pinCodeTest();
        test.withdrawWithOverLimit();
        test.withdrawWithCreditDeptTest();
        test.withdrawNoCreditDeptTest();
        test.depositWithCreditDeptTest();
        test.depositNoCreditDeptTest();


    }
    public void noOverCreditLimitTest() {
        CreditCard card = new CreditCard(999898, 0000);
        BigDecimal withdrawValue = new BigDecimal("500.00");
        boolean condition = card.noOverCreditLimitCheck(withdrawValue);
        checkResult(condition, "No Over Credit Limit");
    }
    public void creditRequiredTest() {
        CreditCard card = new CreditCard(999999, 0000);
        card.setBalance(new BigDecimal("100.00"));
        BigDecimal expectedAnswer = new BigDecimal("900.00");
        boolean condition = card.requiredCredit(new BigDecimal("1000.00")).compareTo(expectedAnswer) == 0;
        checkResult(condition, "Credit Required");

    }

    public void pinCodeTest() {
        CreditCard card = new CreditCard(9090090, 0000);
        int wrongPinCode = 1111;
        boolean condition = !card.checkCardPinCode(wrongPinCode);
        checkResult(condition, "Pin Code");
    }

    public void depositNoCreditDeptTest() {
        CreditCard card = new CreditCard(44567, 0000);
        card.deposit(0000, new BigDecimal("200.00"));
        boolean condition = (card.getCreditDept().compareTo(new BigDecimal("0.00")) == 0 ) &&
                (card.getBalance().compareTo(new BigDecimal("200.00")) == 0);
        checkResult(condition, "Deposit No Credit Dept");
    }

    public void depositWithCreditDeptTest() {
        CreditCard card = new CreditCard(34567, 0000);
        card.setCreditDept(new BigDecimal("100.00"));
        card.deposit(0000, new BigDecimal("200.00"));
        boolean condition = (card.getCreditDept().compareTo(new BigDecimal("0.00")) == 0 ) &&
                (card.getBalance().compareTo(new BigDecimal("100.00")) == 0);
        checkResult(condition, "Deposit With Credit Dept");
    }

    public void withdrawWithOverLimit() {
        CreditCard card = new CreditCard(6888894, 0000);
        card.setBalance(new BigDecimal("100.00"));
        card.withdraw(0000, new BigDecimal("700.00"));
        boolean condition = (card.getBalance().compareTo(new BigDecimal("100.00")) == 0) &&
                (card.getCreditDept().compareTo(new BigDecimal("0.00")) == 0);
        checkResult(condition, "Withdraw with over Credit Limit");
    }

    public void withdrawNoCreditDeptTest() {
        CreditCard card = new CreditCard(23456, 0000);
        card.setBalance(new BigDecimal("200.00"));
        card.withdraw(0000, new BigDecimal("100.00"));
        boolean condition = (card.getBalance().compareTo(new BigDecimal("100.00")) == 0);
        checkResult(condition, "Withdraw Money No Credit Dept");

    }

    public void withdrawWithCreditDeptTest() {
        CreditCard card = new CreditCard(12345, 0000);
        card.withdraw(0000, new BigDecimal("100.00"));
        boolean condition = (card.getBalance().compareTo(new BigDecimal("0.00")) == 0 ) &&
                (card.getCreditDept().compareTo(new BigDecimal("100.00")) == 0 );
        checkResult(condition, "Withdraw Money With Credit Dept");
    }

    public void checkResult(boolean condition, String nameOfTest) {
        if(condition) {
            System.out.println(nameOfTest + " test is OK!");
        }
        else {
            System.out.println(nameOfTest + " test is Fail!");
        }
    }
}
