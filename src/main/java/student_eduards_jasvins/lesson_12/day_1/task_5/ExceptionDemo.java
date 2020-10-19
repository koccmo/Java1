package student_eduards_jasvins.lesson_12.day_1.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ExceptionDemo extends Exception {

    public Exception exception1 = new Exception();

    public Exception exception2 = new Exception(getMessage());

    public Exception exception3 = new Exception(getMessage(), getCause());

}
