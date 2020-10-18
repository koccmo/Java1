package student_dmitrijs_jasvins.lesson_15.day_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Trader {
    String fullName;
    String city;

    public Trader(String name, String city){
        this.fullName = name;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}
