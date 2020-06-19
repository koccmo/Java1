package student_dmitrijs_jasvins.lesson_3.day_x;

public class UserLoginService {

    public boolean login(User user, String password) {
        if (password.equals(user.getPassword())) {
            if (user.isBlocked()) {
                return false;
            } else {
                user.resetRemainingLoginAttempts();
            }
            return true;
        } else {
            user.reduceRemainingLoginAttempts();
            if (user.getRemainingLoginAttempts() == 0) {
                user.block();
            }
            return false;
        }
    }
}