package roman.lesson_12.day_2.task_7_to_16;

import java.util.ArrayList;
import java.util.List;

public class BankApiImplTest {
    public static void main(String[] args) {
//        BankClient anton = new BankClient("1", "Anton Trofimovs");
//        BankClient alex = new BankClient("1x", "Alex Kruglovs");
//        BankClient vlad = new BankClient("123", "Vlad Trope");
//
//        List<BankClient> clients = new ArrayList<>();
//        clients.add(anton);
//        clients.add(alex);
//        clients.add(vlad);
//
//        List<Role> listOfRoles = List.of(Role.values());
//        List<Role> empty = new ArrayList<>();
//
//
//        UserCredentials userCredentials = new UserCredentials(empty);
//
//        BankApi bankApp = new BankApiImpl(clients);
//        try {
//            System.out.println(bankApp.findByUid(userCredentials, "1"));
//        } catch (AccessDeniedException e) {
//            System.out.println(e.getMessage());
//        }
        BankApiImplTest test = new BankApiImplTest();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> bankClientList = new ArrayList<>();
        BankApi bankApi = new BankApiImpl(bankClientList);

        List<Role> roles = new ArrayList<>();
        UserCredentials userCredentials = new UserCredentials(roles);

        try {
            bankApi.findByUid(userCredentials, "1");
            System.out.println("Test is Fail!");
        } catch (AccessDeniedException e) {
            System.out.println("Test is OK!");
        }
    }
}
