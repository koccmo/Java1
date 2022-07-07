package roman.lesson_12.day_1.task_5;

public class ExceptionDemo {
    public static void main(String[] args) {
        Exception exception1 = new Exception();
        Exception exception2 = new Exception("Message");

        Throwable cause = new Throwable();

        Exception exception3 = new Exception("Message", cause);
        Exception exception4 = new Exception(cause);
    }
}
