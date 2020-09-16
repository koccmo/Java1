package student_eduards_jasvins.lesson_10.day_3.task_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FunctionalTest {
    public static void main(String[] args) {

        Functional functionalTest = x -> x > 0;

        System.out.println(functionalTest.functional(10));

        System.out.println(functionalTest.functional(-10));

    }
}
