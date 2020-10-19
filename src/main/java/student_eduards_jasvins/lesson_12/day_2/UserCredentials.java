package student_eduards_jasvins.lesson_12.day_2;

import java.util.ArrayList;  // remove unused imports
import java.util.Arrays;  // remove unused imports
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserCredentials {

    private List<Role> roles;

    UserCredentials (List<Role> roles) { this.roles = roles; }


    public boolean containsRole(Role canSearchClients) { return roles.contains(canSearchClients);
    }
}
