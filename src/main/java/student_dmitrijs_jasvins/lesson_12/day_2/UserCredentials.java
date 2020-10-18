package student_dmitrijs_jasvins.lesson_12.day_2;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles){
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public boolean containCanSearchRole(){
        return getRoles().contains(Role.CAN_SEARCH_CLIENTS);
    }

}
