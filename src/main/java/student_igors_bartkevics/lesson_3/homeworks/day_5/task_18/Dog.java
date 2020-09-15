package student_igors_bartkevics.lesson_3.homeworks.day_5.task_18;

class Dog {

    private String dogName;

    public Dog(String dogName){
        this.dogName = dogName;
    }

    public String voice(){
        return this.dogName + " " + this.dogName + " " + this.dogName;
    }
}
