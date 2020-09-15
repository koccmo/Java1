/*
Task_8:
В теории и на практике у клиентов могут быть разные права
и у одного клиента может быть много разных ролей.

Для описания прав доступа, которые есть у того кто делает
запрос к банковской системе создайте класс UserCredentials:

class UserCredentials {

    private List<Role> roles;

    // созжайте конструктор класса, в котором вы получаете список ролей

}
 */
package student_igors_bartkevics.lesson_12.homework.level_2_intern_task_7_to_16;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

    // созжайте конструктор класса, в котором вы получаете список ролей
    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    boolean hasRole(Role role) {
        return roles.contains(role);
    }
}