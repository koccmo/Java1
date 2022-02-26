package roman.lesson_8.homework.day_3.task_14;

public class ElectricCar extends Car{

    private int batteryCharge;

    public ElectricCar(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    @Override
    void accelerate() {
        batteryCharge--;
    }
}
