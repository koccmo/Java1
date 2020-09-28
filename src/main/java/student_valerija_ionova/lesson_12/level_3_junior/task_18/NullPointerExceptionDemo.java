package student_valerija_ionova.lesson_12.level_3_junior.task_18;

/*Создайте класс NullPointerExceptionDemo
и в main() методе этого класса напишите код,
который приводит к появлению NullPointerException.
В комментариях напишите, когда происходит NullPointerException.

NullPointerException
Возникает при попытке обращения к полю, методу или объекту по ссылке,
равной null. Также исключение выбрасывается, когда метод, не допускающий
передачи аргумента null, был вызван с заданием значения null.
В последнем случае может быть сгенерировано и исключение типа IllegalArgumentException.

Класс NullPointerException унаследован от RuntimeException.*/

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class NullPointerExceptionDemo {

    public static void main (String [] args) {

        int [] test = null;

        System.out.println(test[0]);
    }
}
