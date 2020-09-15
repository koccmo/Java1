package student_aleksandra_maksimovic.lesson_9.level_1.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SafeDemo {
    public static void main(String[] args){

        Safe safe = new Safe("2536", 120);
        safe.getMoney("2536", 120);
        safe.putMoney("2536", 50);

        System.out.println(safe.getAmount());
    }
}
