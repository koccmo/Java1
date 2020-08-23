package student_aleksandra_maksimovic.lesson_8.level_3.task_14;
/*
Исправьте код программы так, что бы он компилировался.
Класс Car менять нельзя.
Классы ElectricCar и PetrolCar должны наследоваться
от класса Car.


abstract class Car {

    abstract void accelerate();

}

class ElectricCar extends Car {

    private int batteryCharge;


}

class PetrolCar extends Car {

    private double petrolTankCapacity;

}
 */

import teacher.codereview.CodeReview;

abstract class Car {

    abstract void accelerate();

}

@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;

    public ElectricCar(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    @Override
    void accelerate() {

    }
}

@CodeReview(approved = true)
class PetrolCar extends Car {

    private double petrolTankCapacity;

    public PetrolCar(double petrolTankCapacity) {
        this.petrolTankCapacity = petrolTankCapacity;
    }
    @Override
    void accelerate() {

    }
}
