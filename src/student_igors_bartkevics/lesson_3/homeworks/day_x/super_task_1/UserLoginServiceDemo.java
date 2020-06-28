package student_igors_bartkevics.lesson_3.homeworks.day_x.super_task_1;

public class UserLoginServiceDemo {

    public static void main(String[] args){

        User userOne = new User("user-login", "user-password");
        UserLoginService service = new UserLoginService();


        System.out.println(service.login(userOne, "user-password-12345")); //Should return false
        System.out.println(userOne.getNumberOfAttempts());
        if (userOne.getUserIsBlocked()) {System.out.println("User is blocked");}

        System.out.println(service.login(userOne, "user-password")); //Should return true
        System.out.println(userOne.getNumberOfAttempts());
        if (userOne.getUserIsBlocked()) {System.out.println("User is blocked");}

        System.out.println(service.login(userOne, "user-password-12345")); //Should return false
        System.out.println(userOne.getNumberOfAttempts());
        if (userOne.getUserIsBlocked()) {System.out.println("User is blocked");}

        System.out.println(service.login(userOne, "user-password-12345")); //Should return false
        System.out.println(userOne.getNumberOfAttempts());
        if (userOne.getUserIsBlocked()) {System.out.println("User is blocked");}

        System.out.println(service.login(userOne, "user-password-12345")); //Should return false
        System.out.println(userOne.getNumberOfAttempts());
        if (userOne.getUserIsBlocked()) {System.out.println("User is blocked");}

        System.out.println(service.login(userOne, "user-password")); //Should return true
        System.out.println(userOne.getNumberOfAttempts());
        if (userOne.getUserIsBlocked()) {System.out.println("User is blocked");}

    }

}
