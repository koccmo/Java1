package student_eduards_jasvins.lesson_8.day_3.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ElectricCar extends Car {

    private int batteryCharge;

    public ElectricCar(int batteryCharge) {
        this.batteryCharge = batteryCharge;

    }

    @Override
    void accelerate() {
        if (batteryCharge == 10) {
            System.out.println("Engine is STARTED");
        } else {
            System.out.println("Engine can't START, no enough capacity");
        }
    }
}
