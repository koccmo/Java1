package student_anvars_intezars.home_tasks.lesson_12.level_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = (credentials, uid) -> Optional.empty();

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL");
        } catch(AccessDeniedException e) {
            System.out.println("TEST OK");
        }

    }

}

