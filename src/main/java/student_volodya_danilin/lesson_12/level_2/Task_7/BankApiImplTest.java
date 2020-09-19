package student_volodya_danilin.lesson_12.level_2.Task_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
        test.shouldNotThrowException();
    }

    void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList<>();
        BankApi api = new BankApiImpl(clients);
        UserCredentials credentials = new UserCredentials();
        try {
            api.findByUid(credentials, "111");
            System.out.println("TEST 1 FAIL");
        } catch (AccessDeniedException e) {
            System.out.println("TEST 1 OK");
        }
    }

    void shouldNotThrowException() {
        List<BankClient> clients = new ArrayList<>();
        BankApi api = new BankApiImpl(clients);
        UserCredentials credentials = new UserCredentials(Role.CAN_SEARCH_CLIENTS);
        try {
            api.findByUid(credentials, "111");
            System.out.println("TEST 2 OK");
        } catch (AccessDeniedException e) {
            System.out.println("TEST 2 FAIL");
        }
    }
}
