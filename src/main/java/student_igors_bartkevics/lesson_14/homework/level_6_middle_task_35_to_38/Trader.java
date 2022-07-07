package student_igors_bartkevics.lesson_14.homework.level_6_middle_task_35_to_38;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Trader {
    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String toString() {
        return "Trader:"+this.name + " in " + this.city;
    }
}