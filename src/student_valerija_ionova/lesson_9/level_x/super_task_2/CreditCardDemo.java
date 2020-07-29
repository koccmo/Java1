package student_valerija_ionova.lesson_9.level_x.super_task_2;

class CreditCardDemo{

    public static void main (String [] args){

        CreditCard card = new CreditCard.CreditCardBuilder("123456789", 1234)
                .balance(100)
                .creditLimit(100)
                .creditBalance(100).build();

        System.out.println(card.toString());
    }

}
