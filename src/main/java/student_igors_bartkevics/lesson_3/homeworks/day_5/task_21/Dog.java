package student_igors_bartkevics.lesson_3.homeworks.day_5.task_21;

class Dog {

    private String dogName;
    private int dogAge;
    private String dogColor;

    public Dog(String dogName, int dogAge, String dogColor){
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public String voice(){
        return this.dogName + " - " + this.dogAge + " - " + this.dogColor;
    }

    public void happyBirthday() {
        this.dogAge++;
        System.out.println("Today is " + this.dogName + "'s birthday. " + this.dogName +  " got older for 1 year!");
    }

}
