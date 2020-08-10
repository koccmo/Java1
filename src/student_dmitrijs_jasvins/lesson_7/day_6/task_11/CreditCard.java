package student_dmitrijs_jasvins.lesson_7.day_6.task_11;

import java.math.BigDecimal;

public class CreditCard {

    private String number;
    private String pinCode;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private BigDecimal creditLoan;

    public CreditCard(String number, String pinCode) {
        this.number = number;
        this.pinCode = pinCode;
        this.creditLimit = BigDecimal.ZERO;
        this.balance = BigDecimal.ZERO;
        this.creditLoan = BigDecimal.ZERO;
    }

    public boolean deposit(String cardPinCode, BigDecimal depositAmount) {
        if (!isPinCodeCorrect(cardPinCode)) {
            System.out.println("Password is incorrect");
            return false;
        } else if (creditLoan.equals(BigDecimal.ZERO)) {
            balance = balance.add(depositAmount);
        } else {
            if (creditLoan.compareTo(depositAmount) > 0) {
                creditLoan = creditLoan.subtract(depositAmount);
            } else {
                BigDecimal moneyAmountToDeposit = depositAmount.subtract(creditLoan);
                creditLoan = BigDecimal.ZERO;
                balance = balance.add(moneyAmountToDeposit);
            }
        }
        return true;
    }

    public boolean withdraw(String cardPinCode, BigDecimal withdrawAmount) {
        if (!isPinCodeCorrect(cardPinCode)) {
            System.out.println("Password is incorrect");
            return false;
        } else if (balance.subtract(withdrawAmount).compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.subtract(withdrawAmount);
        } else {
            BigDecimal requiredLoan = withdrawAmount.subtract(balance);
            BigDecimal maxAvailableLoan = creditLimit.subtract(creditLoan);
            if (maxAvailableLoan.compareTo(requiredLoan) >= 0) {
                creditLoan = creditLoan.add(requiredLoan);
            } else {
                System.out.println("Out of limit");
                return false;
            }
        }
        return true;
    }

    private boolean isPinCodeCorrect(String cardPinCode) {
        return cardPinCode.equals(this.pinCode);
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public void setCreditLoan(BigDecimal creditLoan) {
        this.creditLoan = creditLoan;
    }

}
