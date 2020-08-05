package student_jaroslav_brutan.lesson_7.day_6;

public class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest test = new CreditCardTest();
        test.withdrawTest();
        test.depositTest();
    }

    public void withdrawTest(){
        CreditCard creditCard = new CreditCard(1432, 1892);
        double result = creditCard.withdraw(1892,100);
        if (result == 400){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    public void depositTest(){
        CreditCard creditCard = new CreditCard(1432, 1892);
        double result = creditCard.deposit(1892, 100);
        if (result == 100){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }
}
