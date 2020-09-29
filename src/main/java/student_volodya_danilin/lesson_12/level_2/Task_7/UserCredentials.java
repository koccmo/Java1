package student_volodya_danilin.lesson_12.level_2.Task_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserCredentials {

    private List<Role> roles = new ArrayList<>();

    UserCredentials(Role ... roles) {
        this.roles.addAll(Arrays.asList(roles));
    }

    public List<Role> getRoles() {
        return roles;
    }

    boolean hasRole(Role checkRole) {
        return roles.contains(checkRole);
    }
}
