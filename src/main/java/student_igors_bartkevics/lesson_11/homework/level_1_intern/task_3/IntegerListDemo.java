package student_igors_bartkevics.lesson_11.homework.level_1_intern.task_3;

import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    /*
    - добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //- добавить в список элемент (в конец)
        list.add(24);
        list.add(25);
        list.add(26);

        //- добавить в список элемент (в начало)
        list.add(0, 23);

        //- узнать длину списка
        int length = list.size();
        System.out.println("The length of list: " + length);

        //- удалить элемент из списка по индексу
        list.remove(2);

        //- удалить элемент из списка без индекса)
        list.remove(list.get(0));

        //- узнать пустой список или нет
        System.out.println("Is list empty: " + list.isEmpty());

        //- обойти список и вывести на консоль каждый элемент
        for (Integer value : list) {
            System.out.println(value);
        }
    }

}
