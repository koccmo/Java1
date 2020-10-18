package student_aleksandra_maksimovic.lesson_14.level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Apple {
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
