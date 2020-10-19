package student_eduards_jasvins.lesson_12.day_3.task_21;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TestException extends Exception {

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

// Какой результат мы получим?
//  1. Got the Test Exception
//   Inside finally block
