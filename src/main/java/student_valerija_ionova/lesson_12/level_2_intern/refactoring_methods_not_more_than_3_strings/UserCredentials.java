package student_valerija_ionova.lesson_12.level_2_intern.refactoring_methods_not_more_than_3_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserCredentials {

    private List<Role> roles;

    UserCredentials (Role ... roles){
        this.roles = new ArrayList<>(Arrays.asList(roles));
    }

    List <Role> getRoles(){
        return roles;
    }

}
