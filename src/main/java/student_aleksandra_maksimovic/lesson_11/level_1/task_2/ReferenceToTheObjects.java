package student_aleksandra_maksimovic.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.List;

/*
Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.


public class Objects {

    public static void main(String[] args) {

        List<int> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(52);
        numbers.add(77);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("List length = " + numbers.size());

        numbers.add(0, 99);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("List length = " + numbers.size());

    }
}

 */
//Error:(16, 14) java: unexpected type
//  required: reference
//  found:    int
//

public class ReferenceToTheObjects {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(52);
        numbers.add(77);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("List length = " + numbers.size());

        numbers.add(0, 99);

        for (Integer number : numbers) {
            System.out.println(number);
        }

        System.out.println("List length = " + numbers.size());

    }
}