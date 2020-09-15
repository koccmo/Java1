/*
Необходимо разработать класс "кредитная карта" CreditCard
с учетом инкапсуляции, которая обладает следующими характеристиками:

Свойства
-Номер карты
-Пин-код карты
-Баланс
-Кредитный лимит
-Задолженность по кредиту


Методы

-Зачисление средств на карту ("deposit")
-Снятие средств с карты ("withdraw")

При создании карты нужно указывать ее номер и пинкод.
Начальный баланс и задолженность по кредиту равны 0.
Кредитный лимит можно менять после создания карты.

Требования к снятию средств:
-При снятии средств с карты необходимо указывать пин-код и желаемую сумму;
-Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
-Деньги снимаются с карточного баланса. В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту;
-Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;

Требования к зачислению средств:
-При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
-Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
-В первую очередь зачисление покрывает задолженность по кредиту;
-Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;

Написать тестовые сценарии для класса CreditCard в классе CreditCardTest.
Все тестовые сценарии должны отрабатывать без ошибок.
 */

package student_igors_bartkevics.lesson_7.homework.level_6.task_11;

import java.math.BigDecimal;
import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CreditCard {

    private int cardNumber;
    private int[] cardPin;
    private BigDecimal balance = new BigDecimal("0.00");
    private BigDecimal creditLimit = new BigDecimal("1000.00");
    private BigDecimal loanDebt = new BigDecimal("0.00");

    public CreditCard(int cardNumber, int[] cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setLoanDebt(BigDecimal loanDebt) {
        this.loanDebt = loanDebt;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public BigDecimal getLoanDebt() {
        return loanDebt;
    }

    public int[] getCardPin() {
        return cardPin;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    //Зачисление средств на карту ("deposit")
    public boolean deposit(int[] pinCode, BigDecimal depositValue) {
        if (isPinCodeOk(pinCode)) {
            if (depositValue.compareTo(getLoanDebt()) >= 0) {
                setBalance(getBalance().add(depositValue.subtract(getLoanDebt())));
                setLoanDebt(BigDecimal.ZERO);
            }
            else {
                setLoanDebt(getLoanDebt().subtract(depositValue));
            }
            return true;
        }
        else return false;
    }

    // Снятие средств с карты ("withdraw")
    public boolean withdrawal(int[] pinCode, BigDecimal withdrawalValue) {
        if (isPinCodeOk(pinCode) && isValueOfWithdrawalOk(withdrawalValue)) {
            if (withdrawalValue.compareTo(getBalance()) >= 0) {
                setLoanDebt(getLoanDebt().add(creditRequest(withdrawalValue)));
                setBalance(BigDecimal.ZERO);
            }
            else {
                setBalance(getBalance().subtract(withdrawalValue));
            }
            return true;
        }
        else return false;
    }

    public boolean isPinCodeOk(int[] pinCode) {
        return (Arrays.equals(pinCode, getCardPin()));
    }

    public boolean isValueOfWithdrawalOk(BigDecimal value) {
        return creditRequest(value).add(getLoanDebt()).compareTo(getCreditLimit()) <= 0;
    }

    public BigDecimal creditRequest(BigDecimal withdrawalValue) {
        if (withdrawalValue.compareTo(getBalance()) > 0) {
            return new BigDecimal(String.valueOf(withdrawalValue.subtract(getBalance())));
        }
        return BigDecimal.ZERO;
    }
}

