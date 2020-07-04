package student_aleksandra_maksimovic.lesson_3.homeworks.day_x.super_task1;

public class UserLoginServiceTest {


    static void check(String name, boolean result, boolean expectedResult)
    {
        System.out.println(name + ": " + (result == expectedResult ? "PASS" : "FAILED"));
    }

    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();

        User user1 = new User("admin", "123");

        check("Valid login", service.login(user1, "123"), true);

        check("Invalid attempt #1", service.login(user1, "asd"), false);
        check("Invalid attempt #2", service.login(user1, "asd"), false);
        check("Valid login", service.login(user1, "123"), true);

        check("Invalid attempt #1", service.login(user1, "asd"), false);
        check("Invalid attempt #2", service.login(user1, "asd"), false);
        check("Valid login", service.login(user1, "123"), true);

        check("Invalid attempt #1", service.login(user1, "asd"), false);
        check("Invalid attempt #2", service.login(user1, "asd"), false);
        check("Invalid attempt #3", service.login(user1, "asd"), false);
        check("Valid login (should be blocked)", service.login(user1, "123"), false);

        User user2 = new User("alexandra", "alexandra");
    }
}
