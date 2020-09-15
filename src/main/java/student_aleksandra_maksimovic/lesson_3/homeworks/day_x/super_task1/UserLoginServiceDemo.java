package student_aleksandra_maksimovic.lesson_3.homeworks.day_x.super_task1;

public class UserLoginServiceDemo {


    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();

        User user1 = new User("admin", "123");

        System.out.println(service.login(user1, "123"));

        System.out.println(service.login(user1, "asd"));
        System.out.println(service.login(user1, "asd"));
        System.out.println(service.login(user1, "asd"));
        System.out.println(service.login(user1, "123"));
    }
}
