package student_eduards_jasvins.lesson_7.day_6.task_11;
/*
Необходимо разработать класс "кредитная карта" CreditCard
с учетом инкапсуляции, которая обладает следующими характеристиками:

Свойства
-Номер карты
-Пин-код карты
-Баланс
-Кредитный лимит
-Задолженность по кредиту
 */

import java.math.BigDecimal;

public class CreditCard {

    private String cardNumber;
    private String pinCode;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private BigDecimal loanDebt;

    public void creditCard(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = BigDecimal.ZERO;
        this.creditLimit = BigDecimal.ZERO;
        this.loanDebt = BigDecimal.ZERO;
    }

    public boolean deposit(String pinCode, BigDecimal depositAmount) {
        if (!isPinCodeCorrect(pinCode)) {
            System.out.println("Incorrect pin code!");
            return false;
        } else if (loanDebt.equals(BigDecimal.ZERO)) {
            balance = balance.add(depositAmount);
        } else {
            if (loanDebt.compareTo(depositAmount) > 0) {
                loanDebt = loanDebt.subtract(depositAmount);
            } else {
                BigDecimal moneyAmountToDeposit = depositAmount.subtract(loanDebt);
                loanDebt = BigDecimal.ZERO;
                balance = balance.add(moneyAmountToDeposit);
            }
        }
        return true;
    }

    public boolean withdraw(String pinCode, BigDecimal withdrawAmount) {
        if (!isPinCodeCorrect(pinCode)) {
            System.out.println("Incorrect pin code!");
            return false;
        } else if (balance.subtract(withdrawAmount).compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.subtract(withdrawAmount);
        } else {
            BigDecimal requiredLoan = withdrawAmount.subtract(balance);
            BigDecimal availableLoan = creditLimit.subtract(loanDebt);
            if (availableLoan.compareTo(requiredLoan) >= 0) {
                loanDebt = loanDebt.add(requiredLoan);
            } else {
                System.out.println("Out of limit");
                return false;
                }
        }
        return true;
    }

    private boolean isPinCodeCorrect(String pinCode) { return pinCode.equals(this.pinCode); }
    public void setCreditLimit(BigDecimal creditLimit) { this.creditLimit = creditLimit; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }
    public void setLoanDebt(BigDecimal loanDebt) { this.loanDebt = loanDebt; }


}

