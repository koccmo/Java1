package student_aleksandra_maksimovic.lesson_3.homeworks.day_6.task_24;

public class Basket {
    private int balls = 20;

    public int getBalls(int ballsToTake) {

        if (ballsToTake <= this.balls) {
            this.balls = this.balls - ballsToTake;
            System.out.println("Now in the basket " + this.balls);
            return ballsToTake;
        } else {
            int ballsLeft = this.balls;
            this.balls = 0;
            System.out.println("Now in the basket " + this.balls);
            return ballsLeft;
        }

    }

    public void putBalls(int ballsToPut) {
        this.balls = this.balls + ballsToPut;
        System.out.println("now in the basket " + this.balls);
    }


}
