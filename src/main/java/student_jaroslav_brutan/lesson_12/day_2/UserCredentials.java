package student_jaroslav_brutan.lesson_12.day_2;

import java.util.List;

public class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    boolean hasRole(Role role){
        return roles.contains(role);
    }
}
