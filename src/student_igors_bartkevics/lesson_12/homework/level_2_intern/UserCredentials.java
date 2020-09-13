package student_igors_bartkevics.lesson_12.homework.level_2_intern;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    // созжайте конструктор класса, в котором вы получаете список ролей
    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    boolean contains(Role role) {
        return roles.contains(role);
    }
}