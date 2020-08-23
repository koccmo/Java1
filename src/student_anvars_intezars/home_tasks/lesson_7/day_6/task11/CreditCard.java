package student_anvars_intezars.home_tasks.lesson_7.day_6.task11;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class CreditCard {

    private int cardNumber;
    private int pinCode;
    private int balance;
    private int creditLimit;
    private int creditDebt;

    @CodeReviewComment(teacher = "Это свойство не используется, зачем оно нужно?")
        //свойство удалено

    CreditCard(int cardNumber, int pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        balance = 0;
        creditDebt = 0;
        creditLimit = 1000;
    }

    private int getCreditCardNumber() {
        return cardNumber;
    }

    private int getCreditCardPinCode() {
        return pinCode;
    }

    // Операция при неверном пин коде деньги больше не снимаются. Исправлено.
    // Добавил отдельный метод для проверки пин кода.
    public int withdraw(int pinCode, int amount) {
        boolean currentPinCode = checkPinCode(pinCode);
        if (((currentPinCode) && (balance <= 0) && (creditDebt < creditLimit))) {
            balance = balance + creditLimit;
            balance = balance - amount;
            System.out.println("Withdraw successful. You have used " + amount + " of your Credit Limit.");
        } else {
            System.out.println("Operation is declined");
        }
        return balance;
    }

    // Операция при неверном пин коде деньги больше не снимаются. Исправлено.
    // Добавил отдельный метод для проверки пин кода.
    public int deposit(int pinCode, int amount) {
        boolean currentPinCode = checkPinCode(pinCode);
        if ((currentPinCode) && (creditDebt > 0)) {
            creditDebt = creditDebt + amount;
        } else if ((currentPinCode) && (creditDebt == 0)) {
            balance = balance + amount;
            System.out.println("Deposit successful. You have deposited " + amount + " on your account.");
        } else {
            System.out.println("Operation is declined");
        }
        return balance;
    }

    boolean checkPinCode(int pinCode) {
        int currentPinCode = getCreditCardPinCode();
        if (currentPinCode == pinCode) {
            return true;
        } else {
            return false;
        }
    }


}

