/*
Класс UserLoginService должен представлять сервис для выполнения логики со сравнением и обладать следующими
характеристиками:

Методы
- Операция для входа в учетную запись boolean login(User user, String password).
Метод должен возвращать true если введеный пароль совпадает с паролем пользователя,
а также сбрасывать кол-во попыток на вход, если пользователь не заблокирован.
Метод должен возвращать false если пароли не совпадают,
а также уменьшить кол-во попыток на вход и заблокировать пользователя,
если кол-во попыток исчерпано.

Нефункциональные требования:
Продемонстрировать работу классов (см. пример) в классе UserLoginServiceDemo.

Пример:
UserLoginService service = new UserLoginService();
User userOne = new User("user-login", "user-password");
​
service.login(userOne, "user-password-12345"); //Should return false
service.login(userOne, "user-password"); //Should return true


Опционально:
Написать тестовые сценарии для класса User в UserTest и UserLoginService в классе UserLoginServiceTest.
Все тестовые сценарии должны отрабатывать без ошибок.

 */

package student_igors_bartkevics.lesson_3.homeworks.day_x.super_task_1;

public class UserLoginService {

       public boolean login(User user, String password){
           if (user.getUserPassword().equals(password)) {
               if (!user.getUserIsBlocked()) {
                   user.resetNumberOfAttempts();
               }
               return true;
           }
           else {
               user.decreaseNumberOfAttempts();
               if (user.getNumberOfAttempts() < 1) user.blockUser();
               return false;
           }

       }


}
