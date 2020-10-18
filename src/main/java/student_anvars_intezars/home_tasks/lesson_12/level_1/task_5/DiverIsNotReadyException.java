package student_anvars_intezars.home_tasks.lesson_12.level_1.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DiverIsNotReadyException extends Exception{

    public DiverIsNotReadyException(String message) {
        super(message);
    }
}
