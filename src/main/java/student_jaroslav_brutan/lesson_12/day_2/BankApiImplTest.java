package student_jaroslav_brutan.lesson_12.day_2;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.cantSearchTheClientsInListTest();
        test.clientFoundedInListTest();
        test.failClientInListTest();
    }

    public void resultToString(String name, boolean passedTest){
        if (passedTest){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FAIL!");
        }
    }

    public void failClientInListTest(){
        UserCredentials userCredentials = new UserCredentials(Role.CAN_SEARCH_CLIENTS);
        String uid = "160991";

        BankClient client1 = new BankClient("12345", "Jaroslav Brutan");
        BankClient client2 = new BankClient("54321", "Aleksandr Smirnov");
        List<BankClient> bankClients = new ArrayList<>();
        bankClients.add(client1);
        bankClients.add(client2);
        BankApiImpl bankApi = new BankApiImpl(bankClients);

        try{
            Optional<BankClient> realClients = bankApi.findByUid(userCredentials, uid);
            Optional<BankClient> result = Optional.empty();
            resultToString("failClientInListTest", realClients.equals(result));
        } catch (AccessDeniedException exception){
            resultToString("failClientInListTest", false);
        }
    }

    public void cantSearchTheClientsInListTest(){
        UserCredentials userCredentials = new UserCredentials();
        String uid = "160991";
        BankClient client1 = new BankClient("160991", "Jaroslav Brutan");
        BankClient client2 = new BankClient("54321", "Aleksandr Smirnov");
        List<BankClient> bankClients = new ArrayList<>();
        bankClients.add(client1);
        bankClients.add(client2);
        BankApiImpl bankApi = new BankApiImpl(bankClients);

        try{
            bankApi.findByUid(userCredentials, uid);
            resultToString("cantSearchTheClientsInListTest", false);
        } catch (AccessDeniedException exception){
            resultToString("cantSearchTheClientsInListTest", true);
        }
    }

    public void clientFoundedInListTest(){
        UserCredentials userCredentials = new UserCredentials(Role.CAN_SEARCH_CLIENTS);
        String uid = "160991";
        BankClient client1 = new BankClient("160991", "Jaroslav Brutan");
        BankClient client2 = new BankClient("54321", "Aleksandr Smirnov");
        List<BankClient> bankClients = new ArrayList<>();
        bankClients.add(client1);
        bankClients.add(client2);
        BankApiImpl bankApi = new BankApiImpl(bankClients);

        try {
            Optional<BankClient> realClients = bankApi.findByUid(userCredentials, uid);
            Optional<BankClient> result = Optional.of(new BankClient("160991", "Jaroslav Brutan"));
            resultToString("clientFoundedInListTest", realClients.equals(result));
        } catch (AccessDeniedException exception){
            resultToString("clientFoundedInListTest", false);
        }
    }
}
