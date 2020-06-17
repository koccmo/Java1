package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_1;

/*Продемонстрировать работу классов (см. пример) в классе UserLoginServiceDemo.

Пример:
UserLoginService service = new UserLoginService();
User userOne = new User("user-login", "user-password");
​
service.login(userOne, "user-password-12345"); //Should return false
service.login(userOne, "user-password"); //Should return true*/

public class UserLoginServiceDemo {
    public static void main(String[] args) {

        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");

        boolean ifRightPasswordEntered = service.login(userOne, "user-pasword");
        System.out.println(ifRightPasswordEntered);
        ifRightPasswordEntered = service.login(userOne, "user-password");
        System.out.println(ifRightPasswordEntered);

    }
}
