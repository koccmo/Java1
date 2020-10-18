package student_volodya_danilin.lesson_12.level_3.Task_21;

import teacher.codereview.CodeReview;

/*
Мы получим содержание catch-блока + содержание finally-блока т.к. наш try-блок кидает exception
 */
class TestException extends Exception { }

@CodeReview(approved = true)
class Main {
    public static void main(String args[]) {
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}