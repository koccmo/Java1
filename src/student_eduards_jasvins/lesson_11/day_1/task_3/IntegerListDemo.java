package student_eduards_jasvins.lesson_11.day_1.task_3;


import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {
    public static void main(String[] args) {
        List <Integer> number = new ArrayList<>();
        number.add(10);
        number.add(23);
        number.add(45);

        for (Integer numbers : number)
        System.out.println(numbers);

        System.out.println("--------");

        number.add(0, 1); // в начало.
        number.add(46); // в конец.

        for (Integer numbers : number)
            System.out.println(numbers);

        System.out.println("--------");

        System.out.println("List length = " + number.size()); // узнать длину списка.

        System.out.println("--------");

        number.remove(2); // удалить элемент по интексу.
        number.remove(Integer.valueOf(46)); // удалить элемент из списка без интексa.

        for (Integer numbers : number)
        System.out.println(numbers);

        System.out.println("--------");

        System.out.println("List empty = " + number.isEmpty()); // узнать пустой список или нет.

        System.out.println("--------");

        for (Integer numbers : number) { // обойти список и вывести на консоль каждый элемент.
            System.out.println(numbers);
        }
    }
}
