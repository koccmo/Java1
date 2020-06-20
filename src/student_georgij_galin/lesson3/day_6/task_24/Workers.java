package student_georgij_galin.lesson3.day_6.task_24;

public class Workers {

    private String name;
    private int  age;

    public Workers(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sayAboutYou(){
        System.out.println("Hello! My name "+this.name+". I'm "+age+".");
    }


    public void count() {
    }
}
