package student_anvars_intezars.home_tasks.lesson_9.level_1.task4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Safe {

    public int pinCode;
    public int money;

    Safe(int pinCode, int money) {
        this.pinCode = pinCode;
        this.money = money;
    }

    int getPinCode() {
        return pinCode;
    }

    int getMoney() {
        return money;
    }

}
