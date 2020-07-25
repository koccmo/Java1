package student_valerija_ionova.lesson_9.level_6;

public class Trader {

    private String fullName;
    private String city;

    Trader (String fullName, String city){
        this.fullName = fullName;
        this.city = city;
    }

    String getFullName(){
        return fullName;
    }

    String getCity(){
        return city;
    }

    @Override
    public String toString(){
        return ("Trader:\nFullName: "+fullName+"\nCity: "+city);
    }
}
