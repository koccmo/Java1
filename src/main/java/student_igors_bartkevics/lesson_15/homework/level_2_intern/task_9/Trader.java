package student_igors_bartkevics.lesson_15.homework.level_2_intern.task_9;

class Trader {

    private String fullName;
    private String city;
    private String country;

    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Trader{" +
                "Full name: " + fullName +
                ", city: " + city +
                ", country: " + country +
                '}';
    }
}
