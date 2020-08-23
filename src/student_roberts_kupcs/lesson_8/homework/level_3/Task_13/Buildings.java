package student_roberts_kupcs.lesson_8.homework.level_3.Task_13;

//Придумайте и создайте абстрактный класс и его потомков.

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Buildings {
    private String color;
    private int floors;


    public Buildings(String color, int floors) {
        this.color = color;
        this.floors = floors;

    }

    public abstract void clean();


    public abstract void toFurnish();
}