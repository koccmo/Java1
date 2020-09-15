package student_igors_bartkevics.lesson_3.homeworks.day_5.task_19;

class Dog {

    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge){
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public String voice(){
        return this.dogName + " " + this.dogAge;
    }
}
