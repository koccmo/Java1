package student_igors_bartkevics.lesson_3.homeworks.day_5.task_20;

class Dog {

    private String dogName;
    private int dogAge;

    public Dog(String dogName, int dogAge){
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public String voice(){
        return this.dogName + " - " + this.dogAge;
    }

    public void happyBirthday() {
        this.dogAge++;
        System.out.println("Today is " + this.dogName + "'s birthday. " + this.dogName +  " got older for 1 year!");
    }
}