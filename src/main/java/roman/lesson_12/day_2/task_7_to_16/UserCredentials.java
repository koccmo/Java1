package roman.lesson_12.day_2.task_7_to_16;


import java.util.List;

public class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    boolean checkRoles(Role role) {
        return roles.contains(role);
    }
}
