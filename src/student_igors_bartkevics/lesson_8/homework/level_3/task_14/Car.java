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
package student_igors_bartkevics.lesson_8.homework.level_3.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Car {

    abstract void accelerate();

}
