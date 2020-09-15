package student_eduards_jasvins.lesson_8.day_3.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PetrolCar extends Car {

    private double petrolTankCapacity;

    public PetrolCar(double petrolTankCapacity) {
        this.petrolTankCapacity = petrolTankCapacity;
    }



    @Override
    void accelerate() {
        if (petrolTankCapacity == 25) {
            System.out.println("Rrrrr... Engine is started.");
        } else {
            System.out.println("You need to go GAS STATION.");
        }

    }
}
