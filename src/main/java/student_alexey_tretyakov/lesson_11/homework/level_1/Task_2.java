package student_alexey_tretyakov.lesson_11.homework.level_1;

/*Что может хранить java.util.List: примитивные типы данных или ссылки на объекты,
или то и другое? Напишите программу, в которой кодом продемонстрируйте ответ на вопрос.*/

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class Task_2 {

	@CodeReviewComment(teacher = "Unused field, should be removed.")
    private static List<Tvset> tvsets;

    static class Tvset {
        protected String brand;
        protected int tvSize;

        public Tvset(String brand, int tvSize) {
            this.brand = brand;
            this.tvSize = tvSize;
        }

        protected String getBrand() {
            return brand;
        }

        protected int getTvSize() {
            return tvSize;
        }

    }

    public static void main(String[] args) {
        List<Tvset> tvsets = new ArrayList<>();
        Tvset tv1 = new Tvset("LG",49);
        Tvset tv2 = new Tvset("LG",43);
        Tvset tv3 = new Tvset("Samsung",49);
        Tvset tv4 = new Tvset("LG",55);
        tvsets.add(tv1);
        tvsets.add(tv2);
        tvsets.add(tv3);
        tvsets.add(tv4);
        System.out.println("Print reference :");
        tvsets.forEach(System.out::println);
        System.out.println("Print data :");
        printToConsole(tvsets);
    }
    static void printToConsole(List<Tvset> tvsets){
        for (Tvset tvset : tvsets) {
            System.out.println( tvset.getBrand() + " " + tvset.getTvSize() );
        }
    }


}
