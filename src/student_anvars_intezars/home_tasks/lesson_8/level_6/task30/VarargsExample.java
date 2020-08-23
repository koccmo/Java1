package student_anvars_intezars.home_tasks.lesson_8.level_6.task30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class VarargsExample {
    /*
    Varargs — это аргументы переменной длины: фича, которая
    появилась еще в JDK5. Varargs позволяют нам создавать методы
    с произвольным количеством аргументов. По большому счету, создавать
    такие методы можно было и раньше. Правда, делать это было не очень удобно.

    Source:https://javarush.ru/groups/posts/2733-java-varargs
     */

    void printNumbersOfVarargArray (int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
    }
}
