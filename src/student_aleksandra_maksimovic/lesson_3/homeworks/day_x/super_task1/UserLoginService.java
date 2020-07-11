package student_aleksandra_maksimovic.lesson_3.homeworks.day_x.super_task1;

public class UserLoginService {
    private final int MAXIMAL_FAILED_ATTEMPTS = 3;

    public boolean login(User user, String password)
    {
        if (user.failedAttempts >= MAXIMAL_FAILED_ATTEMPTS)
            return false;

        if (user.password.equals(password)) {
            user.failedAttempts = 0;
            return true;
        }

        user.failedAttempts++;
        return false;
    }
}
