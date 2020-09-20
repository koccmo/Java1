package student_anvars_intezars.home_tasks.lesson_11.level_1.task_2;

import java.util.ArrayList;
import java.util.Arrays;

class DifferentList2 {

    public static void main(String[] args) {

        /*
        java.util.list хранит в себе только ссылочные типы,
        любые объекты, включая сторонние классы. Строки, потоки
        вывода, другие коллекции. Для хранения примитивных типов
        данных используются классы-обертки

       Источник: https://javarush.ru/groups/posts/2354-arraylist-v-java
         */

        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();
        name.add("Aleksandr");
        surname.add("Petrov");
        surname.addAll(name);
        System.out.println(surname);

    }
}
