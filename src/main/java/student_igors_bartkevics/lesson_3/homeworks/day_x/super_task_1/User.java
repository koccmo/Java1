/*
Класс User должен представлять сущность пользователя и обладать следующими характеристиками:

Свойства
- Логин
- Пароль
- Заблокирован ли пользователь
- Количество попыток для входа в учетную запись, до блокировки пользователя (по-умолчанию максимальное количество попыток равно 3)

Методы
- Сбросить количество попыток входа
- Заблокировать пользователя
 */

package student_igors_bartkevics.lesson_3.homeworks.day_x.super_task_1;

class User {

    private String userLogin;
    private String userPassword;
    private boolean userIsBlocked = false;
    private int numberOfAttempts = 3;

    public User(String userLogin, String userPassword){
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void resetNumberOfAttempts() {
        this.numberOfAttempts = 3;
    }

    public void decreaseNumberOfAttempts() {
        this.numberOfAttempts --;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public boolean getUserIsBlocked() {
        return userIsBlocked;
    }

    public void blockUser() {
        this.userIsBlocked = true;
    }




}
