package roman.lesson_9.homework.day_7.super_task_2;



import java.math.BigDecimal;

public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard.CreditCardBuilder("Citadele")
                .setCardNumber(12340909)
                .setCardPinCode(1234)
                .setCreditDept(new BigDecimal("0.00"))
                .setCreditLimit(new BigDecimal("500.00"))
                .setBalance(new BigDecimal("1000.00"))
                .build();

        System.out.println(creditCard.toString());
    }
}
