package student_volodya_danilin.lesson_12.level_2.Task_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AccessDeniedException extends Exception{

    public AccessDeniedException(String message) {
        super(message);
    }

}
