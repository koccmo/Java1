package student_igors_bartkevics.lesson_9.homework.level_1.task_5;

import java.math.BigDecimal;

class SafeVer2Demo {

    public static void main(String[] args) {
        int[] pinCode = {0, 0, 0, 0};
        int[] wrongPinCode = {1, 2, 3, 4};
        SafeVer2 safe = new SafeVer2(pinCode, new BigDecimal("100.00"));

        safe.checkMoneyAmountInSafe(pinCode);
        safe.getMoneyFromSafe(wrongPinCode, new BigDecimal("10.0"));
        safe.checkMoneyAmountInSafe(pinCode);

        safe.getMoneyFromSafe(pinCode, new BigDecimal("10.0"));
        safe.checkMoneyAmountInSafe(pinCode);

        safe.putMoney(wrongPinCode, new BigDecimal("100.00"));
        safe.checkMoneyAmountInSafe(pinCode);

        safe.putMoney(pinCode, new BigDecimal("100.00"));
        safe.checkMoneyAmountInSafe(pinCode);

    }

}
