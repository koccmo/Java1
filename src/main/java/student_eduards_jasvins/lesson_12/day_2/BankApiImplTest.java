package student_eduards_jasvins.lesson_12.day_2;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.searchBankClient();
    }

    void checkResult (String name, boolean condition) {
        if (condition) {
            System.out.println(name + "= OK");
        } else {
            System.out.println(name + "= Fail.");
        }
    }

    void searchBankClient() {
        BankClient client = new BankClient("55522", "Eduards Jasvins");
        List<BankClient> clients = new ArrayList<>();
        clients.add(client);
        BankApi bankApi = new BankApiImpl(clients);

        List<Role> roles = new ArrayList<>();
        roles.add(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);

        try {
            BankClient result = bankApi.findByUid(credentials, "55522").get();
            boolean condition = result.equals(client);
            checkResult("Search Client Test ", condition);
        } catch (AccessDeniedException exception) {
            System.out.println("Test FAIL.");
        }
    }
}

