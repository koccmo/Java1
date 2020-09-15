package student_roberts_kupcs.lesson_9.level_1.Task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeDemo {
    public static void main(String[] args) {

        Safe safe = new Safe();

        safe.amountOfMoney = 10;
        safe.pinCod = 1234;

    }
}
