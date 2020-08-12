package student_dmitrijs_jasvins.lesson_9.day_1.task_4;

import java.math.BigDecimal;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.pinCode = "1234";
        safe.moneyAmount = BigDecimal.valueOf(50);

        safe.pinCode = "1111";
        safe.moneyAmount = BigDecimal.valueOf(10);
    }

}
