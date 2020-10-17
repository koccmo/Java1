package student_jaroslav_brutan.lesson_7.day_6.task_11;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Поправьте имплементацию и напишите тесты так, что бы найденные ошибки учитывались в тестах.")
public class CreditCardTest {

    public static void main(String[] args) {

        CreditCardTest test = new CreditCardTest();
        test.depositTest();
        test.withdrawTest();
    }

    public void withdrawTest(){
        CreditCard creditCard = new CreditCard(1111, 1111);
        boolean result = creditCard.withdraw(1111, 100);
        if (result){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void depositTest() {
        CreditCard creditCard = new CreditCard(1111, 1111);
        boolean result = creditCard.deposit(1111, 100);
        if (result) {
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }
}
