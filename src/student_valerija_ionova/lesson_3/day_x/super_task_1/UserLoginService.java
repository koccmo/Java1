package student_valerija_ionova.lesson_3.day_x.super_task_1;

/*Класс UserLoginService должен представлять сервис для выполнения логики со сравнением и обладать
следующими характеристиками:

Методы
- Операция для входа в учетную запись boolean login(User user, String password).
Метод должен возвращать true если введеный пароль совпадает с паролем пользователя,
а также сбрасывать кол-во попыток на вход, если пользователь не заблокирован.
Метод должен возвращать false если пароли не совпадают,
а также уменьшить кол-во попыток на вход и заблокировать пользователя,
если кол-во попыток исчерпано.*/

public class UserLoginService {


        public boolean login(User user, String password){
            if (user.getPassword().equals(password)) {
                if (!user.blocked) user.restartTimesToBlock();
                return true;
            }
            else {
                user.timesToBlock--;
                if (user.timesToBlock == 0) user.toBlockUser();
                return false;
            }
        };

}
