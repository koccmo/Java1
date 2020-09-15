package student_dmitrijs_jasvins.lesson_8.day_6.task_30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Varargs {
    public int sumAll (int ... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}
