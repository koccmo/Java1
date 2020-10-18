package student_anvars_intezars.home_tasks.lesson_12.level_1.task_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MyException extends Exception {

    private String message;

    public MyException(String message) {
        this.message = message;
    }

}
