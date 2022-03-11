package roman.lesson_9.homework.day_7;

import roman.lesson_7.homework.day_6.task_11.CreditCard;

import java.math.BigDecimal;

public class CreditCardDemo {
    public static void main(String[] args) {
        roman.lesson_7.homework.day_6.task_11.CreditCard card = new CreditCard(24282022, 1111);
        card.printCardInfo();
        card.setCreditDept(new BigDecimal("100.00"));
        card.printCardInfo();
        card.deposit(1111, new BigDecimal("100.00"));
        card.printCardInfo();
        card.withdraw(1111, new BigDecimal("201.00"));
        card.printCardInfo();
        card.withdraw(1111, new BigDecimal("300.00"));
        card.printCardInfo();





    }
}
