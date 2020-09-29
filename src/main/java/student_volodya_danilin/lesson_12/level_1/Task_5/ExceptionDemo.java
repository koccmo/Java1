package student_volodya_danilin.lesson_12.level_1.Task_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ExceptionDemo extends Exception{

    //создание нового исключения без уведомления (message)
    ExceptionDemo() {}

    //создание нового исключения с уведомлением
    ExceptionDemo(String message) {
        super(message);
    }

    //создание нового исключения с уведомлением + причиной
    ExceptionDemo(String message, Throwable cause) {
        super(message, cause);
    }

}
