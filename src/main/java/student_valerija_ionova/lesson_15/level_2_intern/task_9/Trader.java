package student_valerija_ionova.lesson_15.level_2_intern.task_9;

class Trader {

    private String name;
    private String city;

    Trader (String name, String city){
        this.name = name;
        this.city = city;
    }

    String getFullName(){
        return  name;
    }

    String getCity(){
        return city;
    }
}
