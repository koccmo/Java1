package student_valerija_ionova.lesson_9.level_1.task_5;

public class SafeDemo {

    public static void main (String [] args){

        Safe safe = new Safe(1234, 20);

        safe.getMoney(1234, 10);

        safe.putMoney(1234, 25);

        safe.getMoney(1111, 20);

        System.out.println(safe.getMoneyAmount());

    }

}
