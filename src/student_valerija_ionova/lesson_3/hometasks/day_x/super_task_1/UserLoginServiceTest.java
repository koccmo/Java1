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
        userLoginServiceTest.wrongPasswordTest();

    }

        public void rightPasswordTest(){

            UserLoginService service = new UserLoginService();
            User userOne = new User("Bobby", "Anna123");

            if(service.login(userOne, "Anna123")){
                System.out.println("Method login is working good for right password");
            }
            else System.out.println("Method login isn't working good for right password");

            if (userOne.timesToBlock == 3){
                System.out.println("Method login is working good with restart of times to block");
            }else System.out.println("Method login isn't working good with restart of times to block");

        }

    public void wrongPasswordTest() {

        UserLoginService service = new UserLoginService();
        User userOne = new User("Bobby", "Anna123");

        userOne.timesToBlock = 1;
        if (!service.login(userOne, "Anna")) {
            System.out.println("Method login is working good for wrong password");
        } else System.out.println("Method login isn't working good for wrong password");

        if (userOne.timesToBlock == 0) {
            System.out.println("Method login is working good with restart of times to block");
        } else System.out.println("Method login isn't working good with restart of times to block");

        if (userOne.blocked) {
            System.out.println("Block of the user is working good");
        } else {
            System.out.println("Block of the user isn't working good");
        }

        if (!service.login(userOne, "Anna123")) {
            System.out.println("Method login is working good for right password and blocked user");
        } else System.out.println("Method login isn't working good for right password and blocked user");

    }


}
