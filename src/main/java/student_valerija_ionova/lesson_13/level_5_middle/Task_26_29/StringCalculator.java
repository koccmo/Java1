package student_valerija_ionova.lesson_13.level_5_middle.Task_26_29;


//Task 26 Метод может принимать до двух чисел разделённые запятой и возвращает их сумму.
//    Пример входной строки: “” or “1” or “1,2”. Для пустой строки сумма равна 0.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StringCalculator {

    int add (String numbers){
        String [] arrayOfNumber = numbers.split(",");
        int sum = 0;
        if (numbers.equals("")){
            return 0;
        }
        else {
            for (String number : arrayOfNumber) {
                sum += Integer.parseInt(number);

            }
            return sum;
        }
    }
}
