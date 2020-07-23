package student_valerija_ionova.lesson_9.level_1.task_4;

public class SafeDemo {

    public static void main(String[] args) {


        Safe safe = new Safe();

        safe.pinCode =1234;
        safe.pinCode = 2335;

        safe.moneyAmount = 5;
        safe.moneyAmount --;
    }

}
