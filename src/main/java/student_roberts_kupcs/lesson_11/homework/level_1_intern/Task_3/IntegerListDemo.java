package student_roberts_kupcs.lesson_11.homework.level_1_intern.Task_3;


import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class IntegerListDemo {
    public static void main(String[] args) {
        // Создаем новый список целых чисел
        List<Integer> list1 = new ArrayList<>();

        System.out.println("Создаем: " + list1);

        // добавить в список элемент (в начало и в конец)
        list1.add(0, 1);
        list1.add(5);
        list1.add(5);
        list1.add(9);
        System.out.println("добавление: " + list1);

        // узнать длину списка
        int size = list1.size();

        System.out.println("узнать длину списка: " + size);

        // удалить элемент из списка (по интексу и без)
        list1.remove(0);
        list1.remove(list1.get(3));
        System.out.println("удалить: " + list1);

        // узнать пустой список или нет
        //Метод возвращает true, если список пустой,
        //false в обратном случае

        list1.isEmpty();
        System.out.println("узнать пустой список или нет: " + list1.isEmpty());

        // обойти список и вывести на консоль каждый элемент.
        list1.stream().forEach(System.out::println);

    }
}
