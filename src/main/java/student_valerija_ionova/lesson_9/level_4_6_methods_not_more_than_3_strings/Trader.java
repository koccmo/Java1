package student_valerija_ionova.lesson_9.level_4_6_methods_not_more_than_3_strings;

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

    public String getCountry (){
        return country;
    }

    @Override
    public String toString() {
        return "Trader fullName: " + fullName + ", city: " + city +", country: " + country ;
    }
}
