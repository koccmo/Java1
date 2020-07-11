package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_1;

//Написать тестовые сценарии для класса User в UserTest и UserLoginService в классе UserLoginServiceTest.
/*Методы
- Операция для входа в учетную запись boolean login(User user, String password).
Метод должен возвращать true если введеный пароль совпадает с паролем пользователя,
а также сбрасывать кол-во попыток на вход, если пользователь не заблокирован.
Метод должен возвращать false если пароли не совпадают,
а также уменьшить кол-во попыток на вход и заблокировать пользователя,
если кол-во попыток исчерпано.*/


public class UserLoginServiceTest {
    public static void main(String[] args) {

        UserLoginServiceTest userLoginServiceTest = new UserLoginServiceTest();

        userLoginServiceTest.rightPasswordTest();
        userLoginServiceTest.rightPasswordTestWithRestartTimesToBlock();
        userLoginServiceTest.wrongPasswordTest();
        userLoginServiceTest.wrongPasswordTestIfUserWillBeBlocked();
        userLoginServiceTest.wrongPasswordTestTimesToBlock();
        userLoginServiceTest.wrongPasswordTestWithBlockedUser();

        // в идеале каждый тест кейс надо оформлять в отдельный метод!
		// так его проще будет найти и отдельно запустить
    }

    public void checkBoolean(String name, boolean methodsResult, boolean expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" = passed");
        }else
            System.out.println(name+" = failed");
    }

    public void checkInt(String name, int methodsResult, int expectedResult){
        if (methodsResult == expectedResult){
            System.out.println(name+" = passed");
        }else
            System.out.println(name+" = failed");
    }

        public void rightPasswordTest(){
            UserLoginService service = new UserLoginService();
            User userOne = new User("Bobby", "Anna123");
            checkBoolean("Right password test", service.login(userOne, "Anna123"), true);
    }

    public void rightPasswordTestWithRestartTimesToBlock(){

        UserLoginService service = new UserLoginService();
        User userOne = new User("Bobby", "Anna123");
        userOne.timesToBlock = 1;
        service.login(userOne, "Anna123");

        checkInt ("Right password test with restart times to block", userOne.timesToBlock, 3);
    }

    public void wrongPasswordTest() {

        UserLoginService service = new UserLoginService();
        User userOne = new User("Bobby", "Anna123");

        userOne.timesToBlock = 1;
        checkBoolean("Test for wrong password", service.login(userOne, "Anna"), false);
    }

    public void wrongPasswordTestTimesToBlock() {

        UserLoginService service = new UserLoginService();
        User userOne = new User("Bobby", "Anna123");

        userOne.timesToBlock = 1;
        service.login(userOne, "Anna");

        checkInt("Test for wrong password - times to block", userOne.timesToBlock, 0);
    }

    public void wrongPasswordTestIfUserWillBeBlocked() {

        UserLoginService service = new UserLoginService();
        User userOne = new User("Bobby", "Anna123");

        userOne.timesToBlock = 1;
        service.login(userOne, "Anna");

        checkBoolean("Test for wrong password && user blocked", userOne.blocked, true);
    }

    public void wrongPasswordTestWithBlockedUser() {

        UserLoginService service = new UserLoginService();
        User userOne = new User("Bobby", "Anna123");

        userOne.timesToBlock = 1;
        service.login(userOne, "Anna");

        checkBoolean("Test for login if user blocked", service.login(userOne, "Anna123"), false);
    }


}
