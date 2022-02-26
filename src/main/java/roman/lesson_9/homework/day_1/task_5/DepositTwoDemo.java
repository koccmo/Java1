package roman.lesson_9.homework.day_1.task_5;

import java.math.BigDecimal;

public class DepositTwoDemo {
    public static void main(String[] args) {
        DepositTwo depositTwo = new DepositTwo("1234", new BigDecimal("100.00"));

        System.out.println(depositTwo.toString());
        System.out.println(depositTwo.getMoney("1234", new BigDecimal("120.00")));
        System.out.println(depositTwo.toString());
        System.out.println("=========================");
        depositTwo.putMoney("1234", new BigDecimal("80.00"));
        System.out.println(depositTwo.toString());
        System.out.println("==========================");
        System.out.println(depositTwo.getMoney("1234", new BigDecimal("150.00")));
        System.out.println(depositTwo.toString());
        depositTwo.putMoney("1111", new BigDecimal("100.00"));
        depositTwo.getMoney("1234", new BigDecimal("30.00"));
        System.out.println(depositTwo.toString());
    }
}
