package student_dmitrijs_jasvins.lesson_10.day_3.task_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FuncionalInterfaceImpl {
    public static void main(String[] args) {
        FuncionalInterface funcionalInterface = x -> x > 0;
        System.out.println(funcionalInterface.test(10)); // true
        System.out.println(funcionalInterface.test(0)); // false
        System.out.println(funcionalInterface.test(-1)); // false

        /*
        Функциональный интерфейс в Java – это интерфейс, который содержит только 1 абстрактный метод.
         */
    }
}
