package student_pavel_sharkel.lesson_12.level_1.task_5;

public class ExceptionDemo extends Exception {

    Exception exception = new Exception();
    Exception exception2 = new Exception("Exception message");
    Exception exception3 = new Exception("Exception message", getCause());
    Exception exception4 = new Exception("Exception message", getCause());


}
