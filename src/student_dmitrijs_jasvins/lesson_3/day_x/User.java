package student_dmitrijs_jasvins.lesson_3.day_x;

class User {

    private final static int MAX_REMAINING_LOGIN_ATTEMPTS = 3;

    private String name;    // не используемое свойство!
    private String password;
    private boolean blocked;
    private int remainingLoginAttempts = MAX_REMAINING_LOGIN_ATTEMPTS;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void resetRemainingLoginAttempts() {
        remainingLoginAttempts = MAX_REMAINING_LOGIN_ATTEMPTS;
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
