package roman.lesson_11.day_1.task_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("First in array List");
        arrayList.add("Second in array List");
        arrayList.add("Third in array List");
        System.out.println("Print arrayList : ");
        printList(arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("First in linked List");
        linkedList.add("Second in linked List");
        linkedList.add("Third in linked List");
        System.out.println("Print Linked List : ");
        printList(linkedList);
    }

    static void printList(List<String> list) {
        for (String elements : list) {
            System.out.println(elements);
        }
    }
}
