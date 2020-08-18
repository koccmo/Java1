package student_aleksandra_maksimovic.lesson_7.level_6.task_11;


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
public class CreditCard {

    private String cardNumber;
    private String pinCode;
    private int balance;
    private int creditLimit;
    private int creditLoan;

    public CreditCard (String cardNumber, String pinCode) {
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.creditLoan = 0;
    }

    public boolean deposit(String pinCode, int amount) {
       if (!isPinCodeCorrect(pinCode) ) {
           return false;
       }

       if (creditLoan > 0) {
           if (amount >= creditLoan) {
               amount -= creditLoan;
               creditLoan = 0;
           } else {
               creditLoan -= amount;
               amount = 0;
           }
       }

       balance += amount;
       return true;
    }

    public boolean withdraw(String pinCode, int amount) {
        if (!isPinCodeCorrect(pinCode) ) {
            return false;
        }

        int balance = this.balance;
        int creditLoan = this.creditLoan;

        balance -= amount;

        if (balance < 0) {
            creditLoan -= balance;
            balance = 0;
        }

        if (creditLoan > creditLimit)
            return false;

        this.balance = balance;
        this.creditLoan = creditLoan;

        return true;
    }


     public boolean isPinCodeCorrect(String pinCode) {
        return pinCode.equals(this.pinCode);
     }



    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getCreditLoan() {
        return this.creditLoan;
    }
    public void setCreditLoan(int creditLoan) {
        this.creditLoan = creditLoan;
    }



}