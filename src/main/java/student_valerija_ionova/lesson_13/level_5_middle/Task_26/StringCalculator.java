package student_valerija_ionova.lesson_13.level_5_middle.Task_26;


//Task 26 Метод может принимать до двух чисел разделённые запятой и возвращает их сумму.
//    Пример входной строки: “” or “1” or “1,2”. Для пустой строки сумма равна 0.

import java.util.Arrays;

class StringCalculator {

    int add (String numbers){
        String [] arrayOfNumber = numbers.split(",");
        System.out.println(Arrays.toString(arrayOfNumber));
        int sum = 0;
        for (String number : arrayOfNumber){
            try {
                sum += Integer.parseInt(number);
            }catch (NumberFormatException e){

            }

            }
        return sum;
    }



}
