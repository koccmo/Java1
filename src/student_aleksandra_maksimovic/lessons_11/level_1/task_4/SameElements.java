package student_aleksandra_maksimovic.lessons_11.level_1.task_4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Могут ли реализации интерфейса java.util.List хранить одинаковые
элементы (дубликаты)? Напишите код программы, который демонстрирует
ответ на этот вопрос.
 */
public class SameElements {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        for(Integer number : list) {
            System.out.println(number);
        }

        System.out.println("--------------------------------------");


        List<Integer> list2 = new LinkedList<>();

        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);

        for(Integer number : list) {
            System.out.println(number);
        }

        System.out.println("---------------------------------------------");
        System.out.println("Storage of the same elements, is possible...");
    }
}
