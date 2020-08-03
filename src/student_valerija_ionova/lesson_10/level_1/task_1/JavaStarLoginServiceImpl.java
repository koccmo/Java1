package student_valerija_ionova.lesson_10.level_1.task_1;

//Создать интерфейс для данного класса под названием JavaStarLoginService.
//Сделать так, чтобы класс JavaStarLoginServiceImpl имплементировал созданный вами интерфейс.

class JavaStarLoginServiceImpl implements JavaStarLoginService{

    boolean canLogin(String login, String password) {
        return notNull(login)
                && login.equals("javastar")
                && notNull(password)
                && password.equals("pass");
    }

    @Override
    public boolean notNull(String text) {
        return text != null;
    }

}
