package student_valerija_ionova.lesson_7.level_6.task_11;

/*Необходимо разработать класс "кредитная карта" CreditCard
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
    private String cardsNumber;
    private int pinCode;
    private double balance = 0;
    private double creditLimit = 0;
    private double creditBalance = 0;

    public CreditCard (String cardNumber, int pinCode){
        this.cardsNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public String getCardsNumber(){
        return cardsNumber;
    }

    public int getPinCode(){
        return pinCode;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public double getBalance(){
        return balance;
    }

    public double getCreditBalance(){
        return creditBalance;
    }


    public void changeCreditLimit(double amount){
        //creditBalance = creditLimit - creditBalance;
        creditLimit = amount;
        creditBalance = amount;
    }

    public boolean pinCodeCorrect(int pinCode){
        return (pinCode == this.pinCode);
    }

    public double availableBalanceIncludingCreditBalance (){
        return (balance + creditBalance -(creditLimit - creditBalance));
    }

    public boolean enoughMoneyToMakeWithdraw(double amount){

        return (amount < availableBalanceIncludingCreditBalance());
    }

    public void updateBalanceAndCreditBalanceWithdraw(double amount){
        if (amount <= balance){
            balance -= amount;
        }else{
            creditBalance = creditBalance - (amount-balance);
            balance = 0;
        }
    }

    public void updateBalanceAndCreditBalanceDeposit(double amount){
        if (creditBalance == creditLimit){
            balance += amount;
        }else{
            creditBalance += amount;
            if (creditBalance > creditLimit){
                balance = creditBalance - creditLimit;
                creditBalance = creditLimit;
            }
        }
    }

    public boolean withdraw (int pinCode, double amount){
        if ((pinCodeCorrect(pinCode)) && (enoughMoneyToMakeWithdraw(amount))){
            updateBalanceAndCreditBalanceWithdraw(amount);
            return true;
        }else{
            return false;
            }
    }

    public boolean deposit(int pinCode, double amount){
        if (!pinCodeCorrect(pinCode)){
            return false;
        }else{
            updateBalanceAndCreditBalanceDeposit(amount);
            return true;
        }
    }



}
