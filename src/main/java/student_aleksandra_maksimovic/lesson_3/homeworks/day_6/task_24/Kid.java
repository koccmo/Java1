package student_aleksandra_maksimovic.lesson_3.homeworks.day_6.task_24;

public class Kid {
    private int balls = 0;
    private int ballsToTake;

    public Kid(int ballsToTake)  {
        this.ballsToTake = ballsToTake;
    }

    public void takeBalls(Basket basket) {
        int balls = basket.getBalls(ballsToTake);
        System.out.println("i took " +  balls);

        this.balls += balls;
        System.out.println("now i have " +  this.balls);
    }


    public void dropAllBalls(Basket basket) {
        System.out.println("i putting " +  balls);
        basket.putBalls(this.balls);
        this.balls = 0;
        System.out.println("now i have " +  this.balls);
    }
}