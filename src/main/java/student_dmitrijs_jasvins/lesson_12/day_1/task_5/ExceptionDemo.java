package student_dmitrijs_jasvins.lesson_12.day_1.task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ExceptionDemo extends Exception {

    ExceptionDemo(){

    }

    ExceptionDemo(String message){
        super(message);
    }

    ExceptionDemo(String message, Throwable cause){
        super(message, cause);
    }

    ExceptionDemo(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }

    ExceptionDemo(Throwable cause){
        super(cause);
    }

}
