package student_roberts_kupcs.lesson_12.homework.level_2_intern.Task_7_16;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserCredentials {
    private List<Role> roles;

    // созжайте конструктор класса, в котором вы получаете список ролей

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }
}
