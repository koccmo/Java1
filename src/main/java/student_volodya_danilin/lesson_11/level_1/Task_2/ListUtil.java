package student_volodya_danilin.lesson_11.level_1.Task_2;

/*
util.List не может хранить примитивные типы данных, но мы можем пользоваться
классами-оболочками (ака <Integer> <String> ... ).
 */

import java.util.ArrayList;

class ListUtil {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(44);
        integers.add(55);

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(true);
        booleans.add(false);

    }
}
