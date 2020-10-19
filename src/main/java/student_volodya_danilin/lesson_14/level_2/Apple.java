package student_volodya_danilin.lesson_14.level_2;

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

    public String getWeight() {
        return String.valueOf(weight);
    }

}