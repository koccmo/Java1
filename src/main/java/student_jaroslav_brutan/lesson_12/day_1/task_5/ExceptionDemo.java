package student_jaroslav_brutan.lesson_12.day_1.task_5;

public class ExceptionDemo extends Exception{

    public static void main(String[] args) {
        Exception firstException = new Exception();
        Exception secondException = new Exception("Some message");
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        Exception thirdException = new Exception("Some message", arrayIndexOutOfBoundsException);
        Exception fourthException = new Exception(arrayIndexOutOfBoundsException);
    }
}
