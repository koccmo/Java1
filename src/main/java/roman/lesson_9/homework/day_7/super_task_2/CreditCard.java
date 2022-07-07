package roman.lesson_9.homework.day_7.super_task_2;

import java.math.BigDecimal;

public class CreditCard {
    private String nameOfBank;
    private int cardNumber;
    private int cardPinCode;
    private BigDecimal balance;
    private BigDecimal creditLimit;
    private BigDecimal creditDept;

    public String getNameOfBank() {
        return nameOfBank;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getCardPinCode() {
        return cardPinCode;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public BigDecimal getCreditDept() {
        return creditDept;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "nameOfBank='" + nameOfBank + '\'' +
                ", cardNumber=" + cardNumber +
                ", cardPinCode=" + cardPinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", creditDept=" + creditDept +
                '}';
    }

    private CreditCard(CreditCardBuilder creditCardBuilder) {
        this.nameOfBank = creditCardBuilder.nameOfBank;
        this.cardPinCode = creditCardBuilder.cardPinCode;
        this.cardNumber = creditCardBuilder.cardNumber;
        this.balance = creditCardBuilder.balance;
        this.creditLimit = creditCardBuilder.creditLimit;
        this.creditDept = creditCardBuilder.creditDept;


    }

    static class CreditCardBuilder{
        private String nameOfBank;
        private int cardNumber;
        private int cardPinCode;
        private BigDecimal balance;
        private BigDecimal creditLimit;
        private BigDecimal creditDept;

        public CreditCardBuilder(String nameOfBank) {
            this.nameOfBank = nameOfBank;
        }

        public CreditCardBuilder setCardNumber(int cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public CreditCardBuilder setCardPinCode(int cardPinCode) {
            this.cardPinCode = cardPinCode;
            return this;
        }

        public CreditCardBuilder setBalance(BigDecimal balance) {
            this.balance = balance;
            return this;
        }

        public CreditCardBuilder setCreditLimit(BigDecimal creditLimit) {
            this.creditLimit = creditLimit;
            return this;
        }

        public CreditCardBuilder setCreditDept(BigDecimal creditDept) {
            this.creditDept = creditDept;
            return this;
        }

        public CreditCard build() {
            return new CreditCard(this);
        }
    }








}
