package student_jaroslav_brutan.lesson_12.day_2;

import java.util.List;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class UserCredentials {

    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    @CodeReviewComment(teacher = "Not informative method name! Rename it!")
    boolean myRole(Role role){
        return roles.contains(role);
    }
}
