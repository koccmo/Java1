package student_jaroslav_brutan.lesson_7.day_6.task_11;

public class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest test = new CreditCardTest();
        test.withdrawTest1();
        test.depositTest1();
        test.depositTest2();
    }

    public void withdrawTest1(){
        CreditCard creditCard = new CreditCard(1111, 1111);
        creditCard.setCardBalance(200);
        creditCard.setCreditLimit(200);
        creditCard.setCreditLiability(0);
        int result = creditCard.withdraw(1111,100);
        if (result == 100){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    public void depositTest1(){
        CreditCard creditCard = new CreditCard(1111,1111);
        int result = creditCard.deposit(1111, 100);
        creditCard.setCreditLiability(100);
        if (result == 0){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }

    public void depositTest2(){ // this test is failing still figuring it out
        CreditCard creditCard = new CreditCard(1111,1111);
        int result = creditCard.deposit(1111, 100);
        creditCard.setCreditLiability(0);
        creditCard.setCardBalance(0);
        if (result == 100){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FAIL");
        }
    }
}
