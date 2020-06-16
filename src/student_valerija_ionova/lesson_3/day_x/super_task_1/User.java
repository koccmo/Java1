package student_valerija_ionova.lesson_3.day_x.super_task_1;

/*ласс User должен представлять сущность пользователя и обладать следующими характеристиками:

Свойства
- Логин
- Пароль
- Заблокирован ли пользователь
- Количество попыток для входа в учетную запись, до блокировки пользователя (по-умолчанию максимальное
количество попыток равно 3)

Методы
- Сбросить количество попыток входа
- Заблокировать пользователя*/

public class User {

    private String login;
    private String password;
    public boolean blocked;
    public int timesToBlock = 3;

        public User (String login, String password){
        this.login = login;
        this.password = password;
        //this.blocked = blocked;
        //this.timesToBlock = timesToBlock;
    };

    public String getLogin(){
        return login;
    };

    public String getPassword(){
        return password;
    };

    public void restartTimesToBlock(){
        this.timesToBlock = 3;
    };

    public void toBlockUser(){
        this.blocked = true;
    };


}
