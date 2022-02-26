package roman.lesson_8.homework.day_3.task_13;

public abstract class Computer {

    private String manufactured;
    public String getManufactured() {return manufactured;}

    public Computer(String manufactured) {
        this.manufactured = manufactured;
    }


    abstract void turnOn();

    abstract void turnOff();
}
