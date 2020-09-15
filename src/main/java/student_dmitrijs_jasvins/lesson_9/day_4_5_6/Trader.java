package student_dmitrijs_jasvins.lesson_9.day_4_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Trader {

    private String name;
    private String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Trader - " + name +
                ". City - " + city + ", ";
    }
}
