package roman.lesson_11.day_1.task_4;

import java.util.ArrayList;
import java.util.List;

public class DuplicateInList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Rudolf");
        names.add("Zina");
        names.add("Rudolf");
        names.add("Zina");
        System.out.println("Number of list size = " + names.size());
        printList(names);

    }

    static void printList(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
