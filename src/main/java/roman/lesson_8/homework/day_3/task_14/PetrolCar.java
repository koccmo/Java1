package roman.lesson_8.homework.day_3.task_14;

public class PetrolCar extends Car{

    private double petrolTankCapacity;

    public PetrolCar(double petrolTankCapacity) {
        this.petrolTankCapacity = petrolTankCapacity;
    }

    @Override
    void accelerate() {
        petrolTankCapacity--;
    }
}
