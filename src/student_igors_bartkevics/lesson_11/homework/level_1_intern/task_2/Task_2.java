package student_igors_bartkevics.lesson_11.homework.level_1_intern.task_2;

import java.util.ArrayList;
import java.util.List;

class Task_2 {

    //java.util.list может хранить ссылки на объект, для передачи в список примитивных типов данных,
    //их необходимо обернуть в соответствующий класс обёртку

    public static void main(String[] args) {
        //List<int> listOfInt = new ArrayList<>(); попытка в список передать примитивный тип данных
        List<Integer> listOfInteger = new ArrayList<>();
        int number = 5;
        listOfInteger.add(number); // для данной имплементации выполняя добавление значения переменной примитивного
                                  // типа данных int в список, используется класс обёртка Integer,
                                 // и создаётся новый объект типа Integer - listOfInteger.add(new Integer.valueOf(number);
        System.out.println(listOfInteger.get(0));
    }
}
