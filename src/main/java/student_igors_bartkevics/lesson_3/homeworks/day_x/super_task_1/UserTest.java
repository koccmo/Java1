package student_igors_bartkevics.lesson_3.homeworks.day_x.super_task_1;

class UserTest {

    public static void main(String[] args) {

        UserTest userTest = new UserTest();
        userTest.getUserPasswordTest("UserPassword");        //OK
        userTest.getUserPasswordTest("Password");            //FAIL
        userTest.getNumberOfAttemptsTest(3);     //OK
        userTest.decreaseNumberOfAttemptsTest(3);//FAIL
        userTest.decreaseNumberOfAttemptsTest(1);//OK
        userTest.resetNumberOfAttemptsTest(2);   //FAIL
        userTest.resetNumberOfAttemptsTest(3);   //OK
        userTest.getUserIsBlockedTest(false);    //OK
        userTest.blockUserTest(true);            //OK
        userTest.getUserIsBlockedTest(true);     //OK
        userTest.resetNumberOfAttemptsTest(3);   //OK
        userTest.getUserIsBlockedTest(true);    //OK

    }

    User user = new User("UserLogin", "UserPassword");

    public void checkResultInt(String testName, int result, int expectedResult) {
        if (result == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void checkResultBool(String testName, boolean result, boolean expectedResult) {
        if (result == expectedResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    public void getUserPasswordTest(String userPassword) {
        String result = user.getUserPassword();
        if (result.equals(userPassword)) {
            System.out.println("Get user password test = OK");
        }
        else {
            System.out.println("Get user password test = FAIL");
        }
    }

    public void getNumberOfAttemptsTest(int expectedResult) {
        int result = user.getNumberOfAttempts();
        checkResultInt("Get number of attempts test", result, expectedResult);
    }

    public void decreaseNumberOfAttemptsTest(int expectedResult) {
        user.decreaseNumberOfAttempts();
        int result = user.getNumberOfAttempts();
        checkResultInt("Decrease number of attempts test", result, expectedResult);
    }

    public void resetNumberOfAttemptsTest(int expectedResult) {
        user.resetNumberOfAttempts();
        int result = user.getNumberOfAttempts();
        checkResultInt("Reset number of attempts test", result, expectedResult);
    }

    public void getUserIsBlockedTest(boolean expectedResult) {
        boolean result = user.getUserIsBlocked();
        checkResultBool("Get user is blocked test", result, expectedResult);
    }

    public void blockUserTest(boolean expectedResult) {
        user.blockUser();
        boolean result = user.getUserIsBlocked();
        checkResultBool("Block user test", result, expectedResult);
    }

}
