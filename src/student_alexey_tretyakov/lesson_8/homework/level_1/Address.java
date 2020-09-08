package student_alexey_tretyakov.lesson_8.homework.level_1;

 abstract class Address {
    private String city ;
    private String street ;

    protected Address(String city,String street){
        this.city =city;
        this.street = street;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    protected void setStreet(String street) {
        this.street = street;
    }

    protected String getCity() {
        return city;
    }

    protected String getStreet() {
        return street;
    }
}
