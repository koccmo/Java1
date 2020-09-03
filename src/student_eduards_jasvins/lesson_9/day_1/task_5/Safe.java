package student_eduards_jasvins.lesson_9.day_1.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Safe {

    private int pinCode;
    private int moneyAmount;

    public Safe(int pinCode, int moneyAmount) {
    this.pinCode = pinCode;
    this.moneyAmount = moneyAmount;
    }

    public void getMoney(int pinCode, int moneyAmount) {
        if (this.pinCode == pinCode) {
            this.moneyAmount -= moneyAmount;
        }
    }

    public void putMoney(int pinCode, int moneyAmount) {
        if (this.pinCode == pinCode) {
            this.moneyAmount += moneyAmount;
        }
    }

    public int getMoneyAmount() { return moneyAmount; }
}
