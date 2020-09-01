package student_jaroslav_brutan.lesson_9.day_1.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Safe2Demo {

    public static void main(String[] args) {

        Safe2 safe2 = new Safe2("111", 200);
        safe2.getMoney("111", 100);
        System.out.println("Get money for " + safe2.toString());
        safe2.putMoney("111",200);
        System.out.println("Put money for " + safe2.toString());
    }
}
