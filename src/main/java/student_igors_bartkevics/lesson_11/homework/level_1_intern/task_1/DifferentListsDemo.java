package student_igors_bartkevics.lesson_11.homework.level_1_intern.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class DifferentListsDemo {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("I am the 1-st arrayList element");
        arrayList.add("I am the 2-nd arrayList element");
        arrayList.add("I am the 3-rd arrayList element");
        System.out.println("ArrayList elements:");
        printListElementsToConsole(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("I am the 1-st linkedList element");
        linkedList.add("I am the 2-nd linkedList element");
        linkedList.add("I am the 3-rd linkedList element");
        System.out.println("LinkedList elements:");
        printListElementsToConsole(linkedList);
    }

    static void printListElementsToConsole(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

}
