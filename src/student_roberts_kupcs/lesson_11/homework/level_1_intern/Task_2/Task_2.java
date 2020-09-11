package student_roberts_kupcs.lesson_11.homework.level_1_intern.Task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Task_2 {

    public static void main(String[] args) {
        //ArrayList и LinkedList содержат только ссылочные типы данных,
        // то есть сохранить в них можно только объекты.
        // в Java существуют механизмы автоупаковки и автораспаковки,
        // которые позволяют хранить в динамических массивах примитивные типы.

        //Для того, чтобы использовать другие типы, такие как Int, необходимо
        // указать эквивалентный класс - оболочка.

        List<Integer> number = new ArrayList<>();
        //добавление значения переменной.
        number.add(5);
        number.add(10);
        number.add(3);

        for (int i : number) {
            System.out.println(i);
        }

        List<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");

        System.out.println(cars);
    }
}