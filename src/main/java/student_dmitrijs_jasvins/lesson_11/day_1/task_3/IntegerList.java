package student_dmitrijs_jasvins.lesson_11.day_1.task_3;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(23);
        number.add(45);

        for (Integer numbers : number)
            System.out.println(numbers);

        System.out.println("--------");

        number.add(0, 1);
        number.add(46);

        for (Integer numbers : number)
            System.out.println(numbers);

        System.out.println("--------");

        System.out.println("List length = " + number.size());

        System.out.println("--------");

        number.remove(2);
        number.remove(Integer.valueOf(46));

        for (Integer numbers : number)
            System.out.println(numbers);

        System.out.println("--------");

        System.out.println("List empty = " + number.isEmpty());

        System.out.println("--------");

        for (Integer numbers : number) {
            System.out.println(numbers);
        }
    }
}
