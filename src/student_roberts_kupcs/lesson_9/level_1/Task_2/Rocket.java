package student_roberts_kupcs.lesson_9.level_1.Task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Rocket {
    int firingRange;
    double flightSpeed;
    String controlSystem;

    public Rocket(int firingRange, double flightSpeed, String controlSystem) {
        this.firingRange = firingRange;
        this.flightSpeed = flightSpeed;
        this.controlSystem = controlSystem;
    }

    void displayFiringRange() {
        System.out.println("Firing range : " + firingRange);
    }
}
