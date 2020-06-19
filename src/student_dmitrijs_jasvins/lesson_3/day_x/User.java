package student_dmitrijs_jasvins.lesson_3.day_x;

public class User {

    private String name;
    private String password;
    private boolean blocked;
    private int remainingLoginAttempts = 3;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void resetRemainingLoginAttempts() {
        remainingLoginAttempts = 3;
    }

    public void block() {
        blocked = true;
    }

    public void reduceRemainingLoginAttempts() {
        remainingLoginAttempts = remainingLoginAttempts - 1;
    }

    public String getPassword() {
        return password;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public int getRemainingLoginAttempts() {
        return remainingLoginAttempts;
    }
}
