package student_anvars_intezars.home_tasks.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class IntegerListDemo {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.addFirst(5);
        numbers.addLast(6);
        numbers.add(8);
        int sizeOfArray = numbers.size();
        System.out.println("Size of array after adding elements = " + sizeOfArray);
        System.out.println();

       numbers.remove(0);
        boolean contentOfArray = numbers.isEmpty();
        System.out.println("After deleting One element");
        if (contentOfArray) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty. It contains following elements: ");
        }
        for (int i = 0; i< numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
