package student_valerija_ionova.lesson_8.level_6.task_30;

/*Узнать в интернете, что такое varargs.
Придумайте пример кода, в котором продемонстрируйте
использование varargs.
variable number of arguments
*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task_30 {

    public double sumOfNumbers(double ... numbers){
        double sum = 0;
        for (double number : numbers){
            sum += number;
        }
        return sum;
    }
}
