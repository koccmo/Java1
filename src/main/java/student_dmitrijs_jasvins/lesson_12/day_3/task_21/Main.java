package student_dmitrijs_jasvins.lesson_12.day_3.task_21;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Main {
    public static void main(String[] args) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
