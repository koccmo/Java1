package student_valerija_ionova.lesson_12.level_2_intern.task_7;

/*Task8
В теории и на практике у клиентов могут быть разные права
и у одного клиента может быть много разных ролей.

Для описания прав доступа, которые есть у того кто делает
запрос к банковской системе создайте класс UserCredentials:*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UserCredentials {

    private List<Role> roles;

    UserCredentials (Role...roles){
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }
    // созжайте конструктор класса, в котором вы получаете список ролей

    boolean containsRole(Role roleToFind){
        return roles.contains(roleToFind);
    }
}
