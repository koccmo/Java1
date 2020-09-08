package student_eduards_jasvins.lesson_10.day_1.task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class JavaStarLoginServiceImpl implements JavaStarLoginService {

    public boolean canLogin(String login, String password) {
        return notNull(login)
                && login.equals("javastar")
                && notNull(password)
                && password.equals("pass");
    }


    @Override
    public boolean notNull(String text) {
        return  text != null;
    }
}
