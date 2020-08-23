package student_roberts_kupcs.lesson_8.homework.level_3.Task_14;

import teacher.codereview.CodeReview;

//Исправьте код программы так, что бы он компилировался.
//Класс Car менять нельзя.
//Классы ElectricCar и PetrolCar должны наследоваться
//от класса Car.
//
//
//abstract class Car {
//
//    abstract void accelerate();
//
//}
//
//class ElectricCar extends Car {
//
//    private int batteryCharge;
//
//
//}
//
//class PetrolCar extends Car {
//
//    private double petrolTankCapacity;
//
//}
abstract class Car {

    abstract void accelerate();

}

@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;

    @Override
    void accelerate() {

    }
}

@CodeReview(approved = true)
class PetrolCar extends Car {

    private double petrolTankCapacity;

    @Override
    void accelerate() {

    }
}


