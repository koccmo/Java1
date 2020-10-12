package student_alexey_tretyakov.lesson_9.homework.level_4.task_17_21;

// - Rule 1: трейдер по имени "Pokemon" является мошенником, все его транзакции должны быть отклонены.
// - Rule 2: все транзакции на сумму больше 1000000 должны быть отклонены.
// - Rule 3: все транзакции трейдеров из города "Сидней" должны быть отклонены.
// - Rule 4: все транзакции от трейдеров из страны Ямайка должны быть отклонены.
// - Rule 5: все транзакции трейдеров из Германии на сумму больше 1000 должны быть отклонены.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Trader {

    protected String fullName;
    protected String city;
    protected String country;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }


     static class Transaction {

        protected Trader trader;
        protected int amount;

        protected Transaction(Trader trader, int amount) {
            this.trader = trader;
            this.amount = amount;
        }
    }



    public static void main(String[] args) {
        Trader trader = new Trader("Boy", "Riga", "USSR");
        Transaction transaction = new Transaction(trader, 5000);
        FraudDetector fraudDetector = new FraudDetector();
        if (fraudDetector.isFraud(transaction)) {
            System.out.println("Transaction - FRAUD.");
        } else {
            System.out.println("Transaction - OK.");
        }
    }
}

