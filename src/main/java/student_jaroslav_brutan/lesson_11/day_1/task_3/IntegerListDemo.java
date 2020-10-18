package student_jaroslav_brutan.lesson_11.day_1.task_3;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(6);
        numberList.add(7); // сделали список цифр
        System.out.println(numberList);


        numberList.add(0,4); // добавили цифру в начало
        numberList.add(8); // добавили цифру в конец
        System.out.println(numberList);


        System.out.println("Size of list is - " + numberList.size()); // размер лист


        numberList.remove(2);
        System.out.println(numberList); // удалить с индексом


        numberList.remove(numberList.get(3));
        System.out.println(numberList); // удалить без индекса?

        System.out.println(numberList.isEmpty()); // пустой ли лист


        for (Integer value : numberList){
            System.out.println(value); // распечатать все на консолль
        }
    }
}
