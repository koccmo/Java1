package student_igors_bartkevics.lesson_3.homeworks.day_x.super_task_1;

class UserLoginServiceTest {

    public static void main(String[] args) {

        UserLoginServiceTest userLoginServiceTest = new UserLoginServiceTest();
        userLoginServiceTest.rightPasswordAndUserIsNotBlockedYetTest();
        userLoginServiceTest.wrongPasswordAndIsNotBlockedYetTest();
        userLoginServiceTest.wrongPassword_3_TimesBlocksAccessTest();
        userLoginServiceTest.decreaseNumberOfAttemptsTest();
        userLoginServiceTest.resetNumberOfAttemptsTest();
        userLoginServiceTest.isUserBlockedTest();
    }

    public void checkResultBool(String testName, boolean result, boolean expectedResult) {
        if (result == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void checkResultInt(String testName, int result, int expectedResult) {
        if (result == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    UserLoginService service = new UserLoginService();

    public void rightPasswordAndUserIsNotBlockedYetTest(){
        User user = new User("UserName", "UserPassword");
        checkResultBool("Right password entered while user is not blocked yet test", service.login(user, "UserPassword"), true);
    }

    public void wrongPasswordAndIsNotBlockedYetTest(){
        User user = new User("UserName", "UserPassword");
        checkResultBool("Wrong password entered while user is not blocked yet test", service.login(user, "123"), false);
    }

    public void wrongPassword_3_TimesBlocksAccessTest(){
        User user = new User("UserName", "UserPassword");
        service.login(user, "123");
        service.login(user, "123");
        service.login(user, "123");
        checkResultBool("Wrong password entered 3 times blocks access test", service.login(user, "UserPassword"), false);
    }

    public void decreaseNumberOfAttemptsTest(){
        User user = new User("UserName", "UserPassword");
        service.login(user, "123");
        service.login(user, "123");
        checkResultInt("Decrease number of attempts test", user.getNumberOfAttempts(), 1);
    }

    public void resetNumberOfAttemptsTest(){
        User user = new User("UserName", "UserPassword");
        service.login(user, "123");
        service.login(user, "123");
        service.login(user, "UserPassword");
        checkResultInt("Reset number of attempts test", user.getNumberOfAttempts(), 3);
    }

    public void isUserBlockedTest(){
        User user = new User("UserName", "UserPassword");
        service.login(user, "123");
        service.login(user, "123");
        service.login(user, "123");
        service.login(user, "UserPassword");
        checkResultBool("Is user blocked test", user.getUserIsBlocked(), true);
    }

}
