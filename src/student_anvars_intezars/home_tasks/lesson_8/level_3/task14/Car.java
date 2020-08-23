package student_anvars_intezars.home_tasks.lesson_8.level_3.task14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Car {

    abstract void accelerate();
}

@CodeReview(approved = true)
abstract class ElectricCar extends Car {

    private int batteryCharge;
}

@CodeReview(approved = true)
abstract class PetrolCar extends Car {

    private double petrolTankCapacity;
}