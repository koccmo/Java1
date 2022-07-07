package roman.lesson_11.day_1.task_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(1); //добавить в список элемент в конец
        integerList.add(2); //добавить в список элемент в конец

        integerList.add(0, 3); //добавить в список элемент в начало
        System.out.println("Size of arrayList = " + integerList.size()); //узнать длину списка

        integerList.remove(1); //удалить элемент из списка по интексу
        Integer number = 2;
        integerList.remove(number);//удалить элемент из списка без интексу

        System.out.println("List is empty - " + integerList.isEmpty()); //узнать пустой список или нет

        printList(integerList); //обойти список и вывести на консоль каждый элемент.



    }

    static void printList(List<Integer> list) {
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}
