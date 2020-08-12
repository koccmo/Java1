package student_igors_bartkevics.lesson_9.homework.level_1.task_4;

import java.math.BigDecimal;
import java.util.Arrays;

class SafeDemo {
    public static void main(String[] args) {
        int[] pinCode = {0, 0, 0, 0};
        Safe safe = new Safe(pinCode, new BigDecimal("100.00"));
        System.out.println("Pin code of safe is: " + Arrays.toString(safe.pinCode));
        System.out.println("Amount of money in safe is: " + safe.moneyAmount);

        safe.pinCode[0] = 1;
        safe.pinCode[1] = 2;
        safe.pinCode[2] = 3;
        safe.pinCode[3] = 4;
        safe.moneyAmount = safe.moneyAmount.subtract(new BigDecimal("100.00"));

        System.out.println("Pin code of safe now is: " + Arrays.toString(safe.pinCode));
        System.out.println("Amount of money in safe now is: " + safe.moneyAmount);
    }
}
