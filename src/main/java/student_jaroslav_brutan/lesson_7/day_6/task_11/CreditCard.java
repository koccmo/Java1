package student_jaroslav_brutan.lesson_7.day_6.task_11;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class CreditCard {

    private double cardNumber;
    private int pinCode;
    private double cardBalance = 0;
    private double creditLimit = 0;
    private double creditLiability = 0;


    public CreditCard(double cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public double getCardNumber() {
        return cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public boolean correctPinCode(int pinCode){
        return (pinCode == this.pinCode);
    }

    public double getCardBalance(){
        return cardBalance;
    }

    public double getCreditLiability(){
        return creditLiability;
    }

    public void changeCreditLimit(double moneyAmount){
        creditLimit = moneyAmount;
        creditLiability = moneyAmount;
    }

    public double balanceIncludingCreditLiability(){
        return (cardBalance + creditLiability - (creditLimit - creditLiability));
    }

    public boolean canTakeMoneyToWithdraw(double moneyAmount){
        return (moneyAmount < balanceIncludingCreditLiability());
    }

    public void balanceAndCreditBalanceAfterWithdraw(double moneyAmount){
        if (moneyAmount <= cardBalance){
            cardBalance -= moneyAmount;
        } else {
            creditLiability = creditLiability - (moneyAmount - cardBalance);
            cardBalance = 0;
        }
    }

    private void updateCardBalanceAndCreditBalanceForDeposit(double moneyAmount){
        if (creditLiability == creditLimit){
            cardBalance += moneyAmount;
        } else {
            creditLiability += moneyAmount;
            if (creditLiability > creditLimit){
                cardBalance = creditLiability - creditLimit;
                creditLiability = creditLimit;
            }
        }
    }

    @CodeReviewComment(teacher = "Не корректная логика!")
    @CodeReviewComment(teacher = "Пин код неправильный, а баланс будет меняться!")
    @CodeReviewComment(teacher = "Напишите тесты и убедитесь в этом.")
    // исправлено

    public boolean withdraw(int pinCode, double moneyAmount) {
        if ((correctPinCode(pinCode)) && (canTakeMoneyToWithdraw(moneyAmount))){
            return true;
        } else {
            return false;
        }
    }

	@CodeReviewComment(teacher = "Не корректная логика!")
	@CodeReviewComment(teacher = "Пин код неправильный, а баланс будет меняться!")
	@CodeReviewComment(teacher = "Напишите тесты и убедитесь в этом.")
    // исправлено

	public boolean deposit(int pinCode, double moneyAmount) {
        if (!correctPinCode(pinCode)){
            return  false;
        } else {
            updateCardBalanceAndCreditBalanceForDeposit(moneyAmount);
        } return true;
    }
}
