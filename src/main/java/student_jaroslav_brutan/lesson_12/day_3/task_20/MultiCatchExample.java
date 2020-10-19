package student_jaroslav_brutan.lesson_12.day_3.task_20;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class MultiCatchExample {

    public static void main(String[] args) {

        try {

        } catch (ArithmeticException a) {

        } catch (Exception e) {

        } // тк ArithmeticException является наследником Exception, его надо ловить в начале.
    }
}
