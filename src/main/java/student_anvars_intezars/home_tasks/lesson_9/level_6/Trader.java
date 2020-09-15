package student_anvars_intezars.home_tasks.lesson_9.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Trader {

    private String fullName;
    private String city;
    private String country;

    Trader(String fullName, String city,String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    String getFullName() {
        return fullName;
    }

    String getCity() {
        return city;
    }

    String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Trader [fullName=" + fullName
                + ", city= " + city
                + ", country=" + country + "]";
    }
}




