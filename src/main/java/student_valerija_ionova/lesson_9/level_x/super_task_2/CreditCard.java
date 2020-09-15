package student_valerija_ionova.lesson_9.level_x.super_task_2;

/*Знакомимся с дизайн паттернами.
Найти в интернете информацию о дизайн паттерне Builder.
Примеры:
https://dzone.com/articles/design-patterns-the-builder-pattern
https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
Создайте Builder класс для одной из моделей данных из нашего курса и продемонстрируйте его использование.*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CreditCard {

    //All final attributes
    private String cardsNumber;
    private int pinCode;
    private double balance = 0;
    private double creditLimit = 0;
    private double creditBalance = 0;

    @Override
    public String toString(){
        return ("Credit card:\nCards number: "+cardsNumber+
                "\npin code: "+pinCode+"\nBalance: "+balance+
                "\nCreditLimit: "+creditLimit+
                "\nCreditBalance "+creditBalance);
    }

    private CreditCard (CreditCardBuilder builder){
        this.cardsNumber = builder.cardsNumber;
        this.pinCode = builder.pinCode;
        this.balance = builder.balance;
        this.creditLimit = builder.creditLimit;
        this.creditBalance = builder.creditBalance;
    }

    //All getter, and NO setter to provide immutability

    public String getCardsNumber(){
        return cardsNumber;
    }
    public int getPinCode(){
        return pinCode;
    }

    public double getBalance(){
        return balance;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public double getCreditBalance(){
        return creditBalance;
    }

    public static class CreditCardBuilder{
        private String cardsNumber;
        private int pinCode;
        private double balance = 0;
        private double creditLimit = 0;
        private double creditBalance = 0;

        public CreditCardBuilder (String cardsNumber, int pinCode){
            this.cardsNumber = cardsNumber;
            this.pinCode = pinCode;
        }

        public CreditCardBuilder balance (double balance){
            this.balance = balance;
            return this;
        }

        public CreditCardBuilder creditLimit (double creditLimit){
            this.creditLimit = creditLimit;
            return this;
        }

        public CreditCardBuilder creditBalance (double creditBalance){
            this.creditBalance = creditBalance;
            return this;
        }

        //Return the finally constructed CreditCard object
        public CreditCard build(){
            CreditCard card = new CreditCard(this);
            validateCreditCardObject(card);
            return card;
        }

        private void validateCreditCardObject(CreditCard card){
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }

    }




}
