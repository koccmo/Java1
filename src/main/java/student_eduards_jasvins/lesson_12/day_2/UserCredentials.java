package student_eduards_jasvins.lesson_12.day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UserCredentials {

    private List<Role> roles;

    UserCredentials (List<Role> roles) { this.roles = roles; }


    public boolean containsRole(Role canSearchClients) { return roles.contains(canSearchClients);
    }
}
