package student_dmitrijs_jasvins.lesson_3.day_x;

public class UserLoginService {

    private final static int MIN_LOGIN_ATTEMPTS = 0;

    public boolean login(User user, String password) {
        if (user.isBlocked()) {
            return false;
        }
        if (password.equals(user.getPassword())) {
            user.resetRemainingLoginAttempts();

            return true;
        } else {
            user.reduceRemainingLoginAttempts();
            if (user.getRemainingLoginAttempts() == MIN_LOGIN_ATTEMPTS) {
                user.block();
            }
            return false;
        }
    }
}