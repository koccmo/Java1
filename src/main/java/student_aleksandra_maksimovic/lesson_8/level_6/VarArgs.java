package student_aleksandra_maksimovic.lesson_8.level_6;
/*
/*Узнать в интернете, что такое varargs.
Придумайте пример кода, в котором продемонстрируйте
использование varargs.
variable number of arguments
*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class VarArgs {

    public int addAll(int ... numbers)
    {
        int sum = 0;

        for (int i = 0; i < numbers.length ; i++)
        {
            sum = sum + numbers[i];
            System.out.println("Adding " + numbers[i] + ": get " + sum);
        }
        return sum;
    }

}
