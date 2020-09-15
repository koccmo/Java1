package student_jaroslav_brutan.lesson_9.day_1.task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Safe {

    public int pinCode;
    public double moneyInSafe;

    @Override
    public String toString() {
        return "Safe{" +
                "pinCode=" + pinCode +
                ", moneyInSafe=" + moneyInSafe +
                '}';
    }
}
