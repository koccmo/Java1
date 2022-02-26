package roman.lesson_8.homework.day_3.task_13;

public class Dell extends Computer{

    private String model;

    public Dell(String manufactured, String model) {
        super(manufactured);
        this.model = model;
    }

    @Override
    public void turnOn() {
        System.out.println(getManufactured() + " " + model + " Turned ON!");
    }

    @Override
    public void turnOff() {
        System.out.println(getManufactured() + " " + model + " Turned Off!");
    }
}
