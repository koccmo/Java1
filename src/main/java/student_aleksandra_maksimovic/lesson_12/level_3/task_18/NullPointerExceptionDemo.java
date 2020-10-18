package student_aleksandra_maksimovic.lesson_12.level_3.task_18;
/*
Создайте класс NullPointerExceptionDemo
и в main() методе этого класса напишите код,
который приводит к появлению NullPointerException.
В комментариях напишите, когда происходит NullPointerException.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class NullPointerExceptionDemo {

    public static void main(String[] args) {
        String emptyString = null;
        emptyString.isEmpty();// Calling method on something that does not exist is impossible and will raise NullPointerException!
    }

}
