package student_valerija_ionova.lesson_11.level_1.task_1;

/*Какие реализации интерфейса java.util.List вы знаете?
Напишите программу, которая демонстрирует создание разных списков.
PS: чем они отличаются друг от друга?*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RealizationsOfJavaUtilListInterface {

    public static void main (String [] args){

        // ArrayList
        // Использует динамический массив для хранения элементов
        // Манипуляции с таким видом списка медленные, потому что внутри используется массив,
        //      при удалении происходит сдвиг всего массива

        // Класс ArrayList может работать как список только потому, что имплементирует List
        // Больше подходит для хранения и обращения к данным
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println("Size of list1: " + list1.size());


        // LinkedList
        // Использует doubly linked list для хранения элементов
        // Операции производятся быстрее
        // Класс LinkedList может работать как list и queue, потому что имплиментирует List и Deque интерфейсы
        // Больше подходит для манипуляция с данными
        List <Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);
        list2.add(20);
        list2.add(30);
        System.out.println("Element with index 1 is " + list2.get(1));
    }

}


