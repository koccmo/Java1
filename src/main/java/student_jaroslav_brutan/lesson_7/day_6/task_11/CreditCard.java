package student_jaroslav_brutan.lesson_7.day_6.task_11;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class CreditCard {

    private double cardNumber;
    private int pinCode;
    private int cardBalance;
    private int creditLimit;
    private int creditLiability;

    @CodeReviewComment(teacher = "Это свойство не используется, зачем оно нужно?")
    private int moneyAmount;

    public CreditCard(double cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.cardBalance = 0;
        this.creditLiability = 0;
        this.creditLimit = 500;
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setCreditLiability(int creditLiability) {
        this.creditLiability = creditLiability;
    }

    @CodeReviewComment(teacher = "Не корректная логика!")
    @CodeReviewComment(teacher = "Пин код неправильный, а баланс будет меняться!")
    @CodeReviewComment(teacher = "Напишите тесты и убедитесь в этом.")
    public int withdraw(int pinCode, int moneyAmount) {
        int yourPincode = getPinCode();
        if (yourPincode == pinCode) {
            System.out.println("Pin code is correct!");
        } else {
            System.out.println("Pin code is incorrect!");
        }
        if (cardBalance > 0) {
            cardBalance = cardBalance - moneyAmount;
        } else if (creditLiability > creditLimit) {
            System.out.println("Withdraw can't be done!");
        }
        else {
            cardBalance = creditLiability - moneyAmount;
        }
        return cardBalance;
    }

	@CodeReviewComment(teacher = "Не корректная логика!")
	@CodeReviewComment(teacher = "Пин код неправильный, а баланс будет меняться!")
	@CodeReviewComment(teacher = "Напишите тесты и убедитесь в этом.")
	public int deposit(int pinCode, int moneyAmount) {
        int yourPincode = getPinCode();
        if (yourPincode == pinCode) {
            System.out.println("Pin code is correct!");
        } else {
            System.out.println("Pin code is incorrect!");

            if (creditLiability == 0) {
                cardBalance = cardBalance + moneyAmount;
            } else {
                creditLiability = creditLiability + moneyAmount;
                System.out.println(creditLiability);
            }
        } return cardBalance;
    }
}
