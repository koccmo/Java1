package student_aleksandra_maksimovic.lesson_9.level_1.task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.pinCode = "7891";
        safe.amount = 100;

        System.out.println("Pin kod - "+ safe.pinCode + "Money amount = " + safe.amount);

        safe.pinCode = "1111";
        safe.amount = 0;

        System.out.println("Pin kod - "+ safe.pinCode + "Money amount = " + safe.amount);

    }
}
