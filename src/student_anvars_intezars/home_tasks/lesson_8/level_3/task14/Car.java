package student_anvars_intezars.home_tasks.lesson_8.level_3.task14;

abstract class Car {

    abstract void accelerate();
}

abstract class ElectricCar extends Car {

    private int batteryCharge;
}

abstract class PetrolCar extends Car {

    private double petrolTankCapacity;
}