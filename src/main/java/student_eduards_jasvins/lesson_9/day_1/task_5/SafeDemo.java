package student_eduards_jasvins.lesson_9.day_1.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe(1245, 2000);

        safe.getMoney(1245, 1900);
        safe.getMoney(1244, 1000);
        safe.putMoney(1245, 1000);
        safe.putMoney(1234, 2000);

        System.out.println(safe.getMoneyAmount());
    }
}
