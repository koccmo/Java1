package student_anvars_intezars.home_tasks.lesson_3.dayx;

public class User {

    private String login;
    private String password;
    private boolean blocked;
    private String numberOfAttempts;

    public String getLogin(String login) {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isBlocked() {
        return blocked;
    }
    public void setBlocked (boolean blocked) {
        this.blocked = blocked;
    }

}

