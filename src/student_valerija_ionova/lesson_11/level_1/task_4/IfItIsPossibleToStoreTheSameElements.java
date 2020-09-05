package student_valerija_ionova.lesson_11.level_1.task_4;

//Могут ли реализации интерфейса java.util.List хранить одинаковые
//элементы (дубликаты)? Напишите код программы, который демонстрирует
//ответ на этот вопрос.

import java.util.ArrayList;
import java.util.List;

class IfItIsPossibleToStoreTheSameElements {

    public static void main (String [] args) {
        List<Integer> listForExample = new ArrayList<>();

        listForExample.add(10);
        listForExample.add(10);
        listForExample.add(10);
        listForExample.add(10);
        listForExample.add(10);
        listForExample.add(10);

        System.out.println("Yes! It's possible to store the same elements!");
        listForExample.forEach(System.out :: println);
    }

}
