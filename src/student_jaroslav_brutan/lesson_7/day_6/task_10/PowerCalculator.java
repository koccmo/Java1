package student_jaroslav_brutan.lesson_7.day_6.task_10;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PowerCalculator {

        public int powerNumber(int number, int power){
            int result = 1;
            for (int i = 1; i <= power; i++){
                result = result * number;
            } return result;
        }
    }

