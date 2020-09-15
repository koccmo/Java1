package student_anvars_intezars.home_tasks.lesson_9.level_1.task5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class NewSafeDemo {

    public static void main(String[] args) {

        NewSafe mySafe = new NewSafe(112233,1000);
        int moneyTaken = mySafe.getMoney(112233,400);
        int currentAmount = mySafe.putMoney(112233,600);

        System.out.println("After entering password I took " + moneyTaken + " from safe");
        System.out.println("Then I added more money. Now I have " + currentAmount);

    }
}
