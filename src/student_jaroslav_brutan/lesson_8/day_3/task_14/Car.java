package student_jaroslav_brutan.lesson_8.day_3.task_14;

public abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;
    public ElectricCar(int batteryCharge){
        this.batteryCharge = batteryCharge;
    }

    @Override
    void accelerate() {
        batteryCharge ++;
    }
}

class PetrolCar extends Car {

    private double petrolTankCapacity;
    public PetrolCar(double petrolTankCapacity){
        this.petrolTankCapacity = petrolTankCapacity;
    }

    @Override
    void accelerate() {
        this.petrolTankCapacity --;
    }
}

