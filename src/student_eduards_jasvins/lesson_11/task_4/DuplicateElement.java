package student_eduards_jasvins.lesson_11.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class DuplicateElement {

    public static void main(String[] args) {
        List <Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);

        for (Integer numbers : number)
            System.out.println(numbers);

        System.out.println("--------");

        List <Integer> number2 = new LinkedList<>();
        number2.add(1);
        number2.add(2);
        number2.add(3);

        for (Integer numbers : number)
            System.out.println(numbers);
    }
}
