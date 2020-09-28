package student_valerija_ionova.lesson_14.level_2_intern.task_7_13;

//Task 1

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Apple {

    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

}