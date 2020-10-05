package student_alexey_tretyakov.lesson_8.homework.level_3;

public class Task_14 {
    abstract class Car {

        abstract void accelerate();

    }

    class ElectricCar extends Car {

        private int batteryCharge;
        @Override
        void accelerate(){}


    }

    class PetrolCar extends Car {

        private double petrolTankCapacity;
        @Override
        void accelerate(){}

    }

    public static void main(String[] args) {

    }
}
