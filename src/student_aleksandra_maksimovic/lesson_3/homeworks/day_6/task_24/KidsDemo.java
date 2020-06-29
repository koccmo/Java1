package student_aleksandra_maksimovic.lesson_3.homeworks.day_6.task_24;

public class KidsDemo {
    public static void main(String[] args) {
        Basket basket = new Basket();
        //int result = basket.getBalls(100);


        Kid kid1 = new Kid(2);
        kid1.takeBalls(basket);
        kid1.takeBalls(basket);
        kid1.takeBalls(basket);
        kid1.dropAllBalls(basket);



    }
}
