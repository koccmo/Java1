/*
Создайте класс сейф версии 2 с двумя свойствами: пароль и количество денег в сейфе.
Начальные значения этим свойствам задавайте через публичный конструктор.
Сделайте так, что бы достать деньги из сейфа или положить деньги в сейф
можно было только предоставя правильный пароль.
Подсказка: реализуйте эту функциональность через публичные методы: getMoney(...), putMoney(...).
Создайте класс демо и продемонстрируйте, принцып инкапсуляции в действии!
 */
package student_igors_bartkevics.lesson_9.homework.level_1.task_5;

import java.math.BigDecimal;
import java.util.Arrays;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeVer2 {
    private int[] pinCode;
    private BigDecimal moneyAmountInSafe;

    public SafeVer2(int[] pinCode, BigDecimal moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmountInSafe = moneyAmount;
    }

    public void checkMoneyAmountInSafe(int[] pinCode) {
        if (isPinOk(pinCode)) {
            System.out.println("PIN code is OK");
            System.out.println("In safe: " + this.moneyAmountInSafe + " EUR");
        }
        else {
            System.out.println("PIN code entered is incorrect, safe is locked");
        }
        System.out.println("======================================");
    }

    public void getMoneyFromSafe(int[] pinCode, BigDecimal moneyAmountToGet) {
        if (isPinOk(pinCode)) {
            this.moneyAmountInSafe = this.moneyAmountInSafe.subtract(moneyAmountToGet);
            System.out.println("PIN code is OK");
            System.out.println("You got from safe " + moneyAmountToGet + " EUR");
        }
        else {
            System.out.println("PIN code entered is incorrect, safe is locked");
        }
        System.out.println("=======================================");
    }

    public void putMoney(int[] pinCode, BigDecimal moneyAmountToPut) {
        if (isPinOk(pinCode)) {
            this.moneyAmountInSafe = this.moneyAmountInSafe.add(moneyAmountToPut);
            System.out.println("PIN code is OK");
            System.out.println("You put in safe " + moneyAmountToPut + " EUR");
        }
        else {
            System.out.println("PIN code entered is incorrect, safe is locked");
        }
        System.out.println("===============================================");
    }

    private boolean isPinOk(int[] pinCode) {
        return (Arrays.equals(pinCode, this.pinCode));
    }
}
