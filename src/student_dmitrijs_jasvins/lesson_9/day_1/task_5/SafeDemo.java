package student_dmitrijs_jasvins.lesson_9.day_1.task_5;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe("1234", 200);
        safe.getMoney("1234", 20);
        safe.putMoney("1234", 50);
        System.out.println(safe.getBalance());
    }
}
