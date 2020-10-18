package student_roberts_kupcs.lesson_7.homework.level_6.task_11;

//Необходимо разработать класс "кредитная карта" CreditCard
//с учетом инкапсуляции, которая обладает следующими характеристиками:
//
//Свойства
//-Номер карты
//-Пин-код карты
//-Баланс
//-Кредитный лимит
//-Задолженность по кредиту
//
//
//Методы
//
//-Зачисление средств на карту ("deposit")
//-Снятие средств с карты ("withdraw")
//
//При создании карты нужно указывать ее номер и пинкод.
//Начальный баланс и задолженность по кредиту равны 0.
//Кредитный лимит можно менять после создания карты.
//
//Требования к снятию средств:
//-При снятии средств с карты необходимо указывать пин-код и желаемую сумму;
//-Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
//-Деньги снимаются с карточного баланса. В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту;
//-Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;
//
//Требования к зачислению средств:
//-При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
//-Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
//-В первую очередь зачисление покрывает задолженность по кредиту;
//-Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;
//
//Написать тестовые сценарии для класса CreditCard в классе CreditCardTest.
//Все тестовые сценарии должны отрабатывать без ошибок.

import java.util.Scanner;

import teacher.codereview.CodeReview;

import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class CreditCard {
    private String cardNumber;
    private int cardPinCode;
    private long cardBalance = 0;
    private double cardCreditLimit = 0;
    private double cardLoanDebt = 0;

    Scanner KB = new Scanner(System.in);

    public CreditCard(String cardNumber, int cardPinCode) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getCardPinCode() {
        return cardPinCode;
    }
    public void setCardPinCode(int cardPinCode) {
        this.cardPinCode = cardPinCode;
    }

    //metod verifying
    //public void cardVerify() {

    //}
    //metod to deposit money
	@CodeReviewComment(teacher = "Вместо KB.nextLong() передавайте amouunt как переметр этому методу.")
    public void deposit(int cardPinCode) {
        long amouunt;
        System.out.println("Enter amount want to deposit : ");
        amouunt = KB.nextLong();
        if (cardPinCode == 1234) {
            cardBalance = cardBalance + amouunt;
        } else {
            System.out.println("пин-код не совпадаeт");
        }
    }

    //Metod to withdraw money
	@CodeReviewComment(teacher = "cardPinCode - вообще не проверяется? Забирай деньги кто хочет?")
    public void withdraw(int cardPinCode) {
        long amount;
        System.out.println("Enter amount want to withdraw : ");
        amount = KB.nextLong();
        if (cardBalance >= amount) {
            cardBalance = cardBalance -amount;
        } else {
            System.out.println("Less balance..Transaction failed..");
        }
    }
}
