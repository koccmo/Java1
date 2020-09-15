package student_volodya_danilin.lesson_11.level_1.Task_3;

import java.util.ArrayList;

class IntegerListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(0, 44); //добавление числа 44 в начало списка
        integers.add(55); //довавление числа 55 в конец списка

        for (Integer value : integers) {  //распечатка листа
            System.out.println(value);
        }

        int arrayLength = integers.size(); //длина списка

        integers.remove(1); //удаляем число из второй ячейки листа
        integers.remove(Integer.valueOf(44)); //удаляем число 44 из списка

        boolean isEmpty = integers.isEmpty(); //узнаём пустой ли список

    }
}
