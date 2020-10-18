package student_anvars_intezars.home_tasks.lesson_12.level_2;

import teacher.codereview.CodeReview;

import java.util.List;

@CodeReview(approved = true)
class UserCredentials {

    private List<Role> roles;


    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
