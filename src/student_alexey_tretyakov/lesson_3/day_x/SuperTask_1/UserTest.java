package student_alexey_tretyakov.lesson_3.day_x.SuperTask_1;

public class UserTest {
    public static void main(String[] arg) {

        User userOne = new User("Alex", "alex123");
        userOne.userCondition();
        System.out.println("\nChange user attempt to 3 !!");
        userOne.userTimes = 3;
        userOne.userCondition();
        System.out.println("\nChange user state to blocked !!");
        userOne.userState = false;
        userOne.userCondition();

    }
}
