package student_valerija_ionova.lesson_13.level_5_middle.Task_30;

/*Дайте возможность методу add() принимать строку с числами разделёнными не
только запятой, но и символом новой строки: "\n".

Пример:
- “1\n23,4” (результат 10) - разрешённый ввод
- “1\n” - не разрешённый ввод ??Почему? Разделение в конце? Нет запятой?

Не забывайте писать тесты!*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StringCalculator {

    int add (String numbers){
        String [] arrayOfNumber = numbers.split(",|\n");
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