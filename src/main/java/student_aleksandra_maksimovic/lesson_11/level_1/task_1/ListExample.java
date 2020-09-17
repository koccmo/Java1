package student_aleksandra_maksimovic.lesson_11.level_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import teacher.codereview.CodeReview;

/*
Какие реализации интерфейса java.util.List вы знаете?
Напишите программу, которая демонстрирует создание разных списков.
PS: чем они отличаются друг от друга?
 */

@CodeReview(approved = true)
public class ListExample {

    public static void main(String[] args) {
        //ArrayList
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(52);
        numbers.add(77);

        for (Integer number : numbers) {
            System.out.println(number);
        }


        System.out.println("-----------------------------------------------------------------");

        // LinkedList
        List <Integer> numbers2 = new LinkedList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.remove(0);
        numbers2.add(8);

        for (Integer num : numbers2) {
            System.out.println(num);
        }

    }
    //LinkedList consumes more memory than an ArrayList because it also stores the next
    //and previous references along with the data.

    //An element can be accessed in an ArrayList in O(1) time (directly by index)
    //It takes O(n) time to access an element in a LinkedList (traverse to the desired
    //element though references)

    //ArrayList is usually slower, because the elements in the ArrayList needs to be shifted if
    //element is added or removed in the middle (capacity changes matter as well)

    //LinkedList is faster because only references must be changed

}