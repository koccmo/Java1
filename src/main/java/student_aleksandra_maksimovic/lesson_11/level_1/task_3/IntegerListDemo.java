package student_aleksandra_maksimovic.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

/*
В классе IntegerListDemo создайте список целых чисел.
Продемонстрируйте как:
- добавить в список элемент (в начало и в конец)
- узнать длину списка
- удалить элемент из списка (по интексу и без)
- узнать пустой список или нет
- обойти список и вывести на консоль каждый элемент.
 */

@CodeReview(approved = true)
public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> numbers =  new ArrayList<>();

        numbers.add(22);
        numbers.add(33);
        numbers.add(44);
        numbers.add(55);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("--------------------------");


        numbers.add(0,11); // - добавить в начало списка
        numbers.add(66); // - добавить в конец списка

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("--------------------------");

        System.out.println("List length = " + numbers.size()); // - узнать длину списка

        numbers.remove(2); // - удалить по индексу
        numbers.remove(Integer.valueOf(44)); // - удалить без индекса

        System.out.println(numbers);

        System.out.println("--------------------------");

        System.out.println("Is list empty: "+ numbers.isEmpty()); // - узнать пустой ли список

        System.out.println("--------------------------");

        for (Integer number : numbers) { //- обойти список и вывести на консоль каждый элемент
            System.out.println(number);
        }

    }

}
