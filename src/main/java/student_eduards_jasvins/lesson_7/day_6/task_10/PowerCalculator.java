package student_eduards_jasvins.lesson_7.day_6.task_10;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PowerCalculator {

    public int powerCalculator(int power, int number) {
        int result = 1;
        int i = 1;
        do {
            if (power >= 0) {
                result *= number;
            }
            i++;
        } while (i <= power);
        return result;
    }
}



