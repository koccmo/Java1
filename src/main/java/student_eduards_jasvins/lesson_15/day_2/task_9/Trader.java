package student_eduards_jasvins.lesson_15.day_2.task_9;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Trader {

    private String fullName;
    private String city;


    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
        ;
    }

    public String getFullName() {
        return this.fullName;
    }


    public String getCity() {
        return this.city;
    }

    public String toString() {
        return "Trader:"+this.fullName + " in " + this.city;
    }
}
