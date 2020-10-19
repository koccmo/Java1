package student_roberts_kupcs.lesson_14.homework.level_1_2.Task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
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
