package student_igors_bartkevics.lesson_11.homework.level_1_intern.task_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SameElementsInList {

    //реализации интерфейса java.util.List могут хранить одинаковы элементы (дубликаты)

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        String string = "STRING";

        list1.add(string);
        list1.add(string);
        list1.add(string);
        list1.add(string);

        list2.add(string);
        list2.add(string);
        list2.add(string);
        list2.add(string);

        if (list1.size() == list2.size() && list1.size() == 4) {
            System.out.println("java.util.list implementations CAN contain same elements 'duplicates'");
        }

    }



}
