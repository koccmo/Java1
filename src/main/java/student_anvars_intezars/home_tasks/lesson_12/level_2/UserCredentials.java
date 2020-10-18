package student_anvars_intezars.home_tasks.lesson_12.level_2;

import student_aleksandra_maksimovic.lesson_10.level_1.task_3.MyList;

import java.util.List;

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
