package student_alexey_tretyakov.lesson_3.day_x.SuperTask_1;

public class UserTest {
    public static void main(String[] arg) {

        User userOne = new User("user", "user123");
        UserTest userTest = new UserTest();
        userTest.testLoginName(userOne, "user");
        userTest.testPassword( userOne, "user123");
        userTest.testUserAttempt( userOne, 1);
    }

    public void testLoginName ( User user1, String userTestName) {
        if ( user1.userLoginName.equals( userTestName ) ) {
            System.out.println( "Test OK,  user name : " + userTestName);
        } else {
                System.out.println( "Test FAIL . True user name = " + user1.userLoginName);
        }
    }
    public void testPassword ( User user1, String userPwd) {

        if ( user1.userPassword.equals( userPwd ) ) {
            System.out.println( "Test password OK. " );
        } else {
            System.out.println( "Test password FAIL ." );
        }
    }
    public void testUserAttempt ( User user1, int testAttempt) {

        if ( ( 0 < testAttempt )  && ( testAttempt < 3 )) {
            System.out.println( "Test OK,  user attempt = " + testAttempt);
        } else {
            System.out.println( "Test FAIL . user attempt = " + user1.userTimes);
        }
    }
}
