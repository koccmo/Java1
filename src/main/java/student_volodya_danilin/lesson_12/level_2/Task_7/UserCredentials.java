package student_volodya_danilin.lesson_12.level_2.Task_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UserCredentials {

    private List<Role> roles = new ArrayList<>();

    UserCredentials(Role ... roles) {
        this.roles.addAll(Arrays.asList(roles));
    }

    public List<Role> getRoles() {
        return roles;
    }

    boolean hasRole(Role checkRole) {
        boolean result = false;
        if (roles.contains(checkRole)) {
            result = true;
        }
        return result;
    }
}
