package student_anvars_intezars.home_tasks.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo2 {

    /*
    Реализации интерфейса java.util.List могут хранить одинаковые
    элементы (дубликаты).
    Ниже программа отображает пример добавления дубликатов в список.
     */

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(8);
        numbers.add(8);
        numbers.add(8);
        System.out.println("List contains following duplicates");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
