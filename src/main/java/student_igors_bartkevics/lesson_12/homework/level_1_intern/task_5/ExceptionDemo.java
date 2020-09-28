package student_igors_bartkevics.lesson_12.homework.level_1_intern.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ExceptionDemo {
    public static void main(String[] args) {
        Exception exception1 = new Exception();
        Exception exception2 = new Exception("Specified detail message");
        Throwable cause = new Throwable();
        Exception exception3 = new Exception("Specified detail message", cause);
        Exception exception4 = new Exception(cause);
    }
}
