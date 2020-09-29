package student_aleksandra_maksimovic.lesson_12.level_3.task_20;
/*
Правильно ли написан try catch блок? Откомпилируется ли код?

try {

} catch (Exception e) {

} catch (ArithmeticException a) {

}

Создайте класс MultiCatchExample и в его main() методе
поместите правильный try catch блок и в коментариях напишите пояснение.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class MultiCatchExample {

    public static void main(String[] args) {
        try {

        } catch (ArithmeticException a) { // ArithmeticException наследуется от Exception, следовательно ,если
                                         // Exception выполнится первым ,ArithmeticException отловится уже там..
        } catch (Exception e) {

        }


    }
}