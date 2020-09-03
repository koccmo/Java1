package student_roberts_kupcs.lesson_9.level_5.Task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Trader {
    private String fullName;
    private String city;
    private String country;

    public Trader(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}
