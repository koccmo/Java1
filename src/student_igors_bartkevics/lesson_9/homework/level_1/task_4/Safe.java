/*
Создайте класс сейф с двумя свойствами: пинкод и количество денег в сейфе.
Сделайте эти свойства публично доступными.
Создайте класс демо и продемонстрируйте, что можно делать с публичными свойствами объекта.
 */
package student_igors_bartkevics.lesson_9.homework.level_1.task_4;

import java.math.BigDecimal;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Safe {

    public int[] pinCode;
    public BigDecimal moneyAmount;

    public Safe(int[] pinCode, BigDecimal moneyAmount) {
        this.pinCode = pinCode;
        this.moneyAmount = moneyAmount;
    }
}
