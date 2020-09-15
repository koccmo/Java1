/*
Task_13:
Создайте класс BankApiImplTest и напишите тесты для метода findByUid().
 */
package student_igors_bartkevics.lesson_12.homework.level_2_intern_task_7_to_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.findByUidPositiveTest();
        test.findByUidNegativeTest();
        test.findByUidNoRightsToSearchClientTest();
    }

    void findByUidPositiveTest() {
        List<BankClient> clients = new ArrayList<>();

        clients.add(new BankClient("1", "Client1"));
        clients.add(new BankClient("2", "Client2"));
        clients.add(new BankClient("3", "Client3"));
        BankApi bankApi = new BankApiImpl(clients);

        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials userCredentials = new UserCredentials(roles);

        try {
            BankClient result = bankApi.findByUid(userCredentials, "1").get();
            boolean condition = result.equals(new BankClient("1", "Client1"));
            checkResult(condition, "Find by uid positive");
        } catch (AccessDeniedException exception) {
            System.out.println("Test failed");
        }
    }

    void findByUidNegativeTest() {
        List<BankClient> clients = new ArrayList<>();

        clients.add(new BankClient("1", "Client1"));
        clients.add(new BankClient("2", "Client2"));
        clients.add(new BankClient("3", "Client3"));
        BankApi bankApi = new BankApiImpl(clients);

        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials userCredentials = new UserCredentials(roles);

        try {
            Optional<BankClient> result = bankApi.findByUid(userCredentials, "4");
            boolean condition = result.equals(Optional.empty());
            checkResult(condition, "Find by uid negative");
        } catch (AccessDeniedException exception) {
            System.out.println("Test failed");
        }
    }

    void findByUidNoRightsToSearchClientTest() {
        List<BankClient> clients = new ArrayList<>();

        clients.add(new BankClient("1", "Client1"));
        clients.add(new BankClient("2", "Client2"));
        clients.add(new BankClient("3", "Client3"));
        BankApi bankApi = new BankApiImpl(clients);

        List<Role> roles = new ArrayList<>();
        UserCredentials userCredentials = new UserCredentials(roles);

        try {
            Optional<BankClient> result = bankApi.findByUid(userCredentials, "1");
            System.out.println("Test failed");
        } catch (AccessDeniedException exception) {
            String message = "You've got no rights to search clients";
            boolean condition = exception.getMessage().equals(message);
            checkResult(condition, "Find by uid no rights to search client");
        }
    }


    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
