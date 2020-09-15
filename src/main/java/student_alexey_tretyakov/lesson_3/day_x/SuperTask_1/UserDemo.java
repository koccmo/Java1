package student_alexey_tretyakov.lesson_3.day_x.SuperTask_1;

public class UserDemo {  // это не тест - это Demo класс, а где тесты?
    public static void main(String[] arg) {

        User userOne = new User("user", "user123");
        userOne.userCondition();
        System.out.println("\nChange user attempt to 3 !!");
        userOne.userTimes = 3;
        userOne.userCondition();
        System.out.println("\nChange user state to blocked !!");
        userOne.userActivity = false;
        userOne.userCondition();

    }
}
