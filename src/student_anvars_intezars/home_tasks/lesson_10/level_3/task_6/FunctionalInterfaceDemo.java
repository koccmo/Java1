package student_anvars_intezars.home_tasks.lesson_10.level_3.task_6;

/*
В данном коде отображено как работает абстратный метод,
который позволяет проверить является ли целочисленное
число положительным, либо отрицательным.
 */

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(5));
        System.out.println(isPositive.test(-2));
        System.out.println(isPositive.test(8));
        System.out.println(isPositive.test(-9));
    }


}
