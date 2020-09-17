package student_valerija_ionova.lesson_11.level_1.task_3;


/* В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.*/

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class IntegerListDemo {

    public static void main (String [] args){

        List<String> demoList = new ArrayList<>();
        demoList.add("Some element");
        demoList.add("Some element");
        demoList.add("Some element");
        demoList.add("Some element");
        System.out.println("It's list: " + demoList);

        //- добавить в список элемент (в начало и в конец)
        demoList.add(0,"First element");
        demoList.add("Last element");
        System.out.println("\nIt's updated list with added first and last elements: \n\n" + demoList);

        //- узнать длину списка
        System.out.println("\nIt's length of list: \n\n" + demoList.size());

        //- удалить элемент из списка (по интексу и без)
        demoList.remove(1);
        System.out.println("\nIt's updated list after 1 element was deleted: \n\n" + demoList);
        demoList.remove("Last element");
        System.out.println("\nIt's updated list after element \"Last element\" was deleted: \n\n" + demoList);

        //- узнать пустой список или нет

        System.out.println("\nIt's method to check if list is empty: .isEmpty(), and list is empty: \n\n" + demoList.isEmpty());
        //- обойти список и вывести на консоль каждый элемент.

        System.out.println("\n\n");
        demoList.forEach(System.out :: println);

    }

}
