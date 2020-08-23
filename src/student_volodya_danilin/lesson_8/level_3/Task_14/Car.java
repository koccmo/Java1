package student_volodya_danilin.lesson_8.level_3.Task_14;

import teacher.codereview.CodeReview;

abstract class Car {

    abstract void accelerate();

}

@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;


    @Override
    void accelerate() {
        System.out.println("Electric car accelerates!");
    }
}

@CodeReview(approved = true)
class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {
        System.out.println("Petrol car accelerates!");
    }
}