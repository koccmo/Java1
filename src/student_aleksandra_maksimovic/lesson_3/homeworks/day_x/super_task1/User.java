package student_aleksandra_maksimovic.lesson_3.homeworks.day_x.super_task1;

public class User {
    public String login;
    public String password;
    public int failedAttempts = 0;

    public User(String login, String password)
    {
        this.login = login;
        this.password = password;
    }
}
