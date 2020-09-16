package student_valerija_ionova.lesson_11.level_1.task_2;

//Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
//или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.

// Ссылки на объекты

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TypeOfDatesInList {
    public static void main (String [] args) {
        List<String> listOfIntegers = new ArrayList<>();
        listOfIntegers.add("It's object String");

        // list <char> listError = new ArrayList<>(); Это будет ошибкой, т.к. char примитивный тип данных
    }

}
