package student_igors_bartkevics.lesson_8.homework.level_3.task_14;

class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {
        petrolTankCapacity--;
    }
}
