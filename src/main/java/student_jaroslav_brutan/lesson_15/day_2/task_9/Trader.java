package student_jaroslav_brutan.lesson_15.day_2.task_9;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Trader {

    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    String getFullName(){
        return name;
    }

    String getCity(){
        return city;
    }
}
