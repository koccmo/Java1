package student_alexey_tretyakov.lesson_11.homework.level_1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
Какие реализации интерфейса java.util.List вы знаете?
        Напишите программу, которая демонстрирует создание разных списков.
        PS: чем они отличаются друг от друга?

 */
/*  Реализации интерфейса List(E) :
    AbstractList, AbstractSequentialList, ArrayList, AttributeList,
    CopyOnWriteArrayList, LinkedList, RoleList, RoleUnresolvedList, Stack, Vector
    Из них пока известны ArrayList, LinkedList
 */
 class Task_1 {


    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("Hello");
        words.add("world");
        words.add("Java");
        words.add("hello");
        words.add("hello");
        words.add("hello");

        printToConsole( words );

        printToConsole( words );

        words.removeAll( Collections.singleton("hello"));
        System.out.println("\nAfter remove:");
        printToConsole( words );

        words.add(1,"all");
        System.out.println("\nAfter insert:");
        printToConsole( words );

        words.add(1,"hello");
        words.add(3,"hello");
        words.add(6,"hello");
        System.out.println("\nAfter insert hello:");
        printToConsole( words );

        words.removeAll( Collections.singleton("hello"));
        System.out.println("\nAfter remove hello");
        printToConsole( words );
    }


    static void printToConsole(List<String> words){
        for (String str : words) {
            System.out.print(str + " ");
        }
    }
}
