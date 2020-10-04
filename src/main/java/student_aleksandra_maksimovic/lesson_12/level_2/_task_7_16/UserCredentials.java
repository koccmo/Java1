package student_aleksandra_maksimovic.lesson_12.level_2._task_7_16;
/*
В теории и на практике у клиентов могут быть разные права
и у одного клиента может быть много разных ролей.

Для описания прав доступа, которые есть у того кто делает
запрос к банковской системе создайте класс UserCredentials:
 */
import java.util.List;

class UserCredentials {

     private List<Role> roles;

     //- создайте конструктор класса, в котором вы получаете список ролей
    UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    boolean isRole(Role role) {
        return roles.contains(role);
    }
}

