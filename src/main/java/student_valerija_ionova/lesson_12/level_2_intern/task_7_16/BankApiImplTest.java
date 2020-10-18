package student_valerija_ionova.lesson_12.level_2_intern.task_7_16;

//Task 13 Создайте класс BankApiImplTest и напишите тесты для метода findByUid().

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BankApiImplTest {

    public static void main (String [] args){

        BankApiImplTest bankApiImplTest = new BankApiImplTest();

        bankApiImplTest.testCantSearchClients();
        bankApiImplTest.testCanSearchClientNoCorrespondingClientInList();
        bankApiImplTest.testCanSearchClientClientFoundedClientInList();
    }

    void printResult(String name, boolean isTestPassed){
        if (isTestPassed){
            System.out.println(name + " OK");
        }else{
            System.out.println(name + "FAIL");
        }
    }

    void testCantSearchClients(){
        UserCredentials userCredentials = new UserCredentials();
        String uid = "12345";

        BankClient bankClient1 = new BankClient("12345", "Bob Bobbins");
        BankClient bankClient2 = new BankClient("12346", "John Jonnins");

        List<BankClient> clients = new ArrayList<>();
        clients.add(bankClient1);
        clients.add(bankClient2);

        BankApiImpl bankApi = new BankApiImpl(clients);

        try{
            bankApi.findByUid(userCredentials, uid);
            printResult("testCantSearchClients", false);
        }catch(AccessDeniedException exception){
            printResult("testCantSearchClients", true);
        }

    }

    void testCanSearchClientNoCorrespondingClientInList(){
        UserCredentials userCredentials = new UserCredentials(Role.CAN_SEARCH_CLIENTS);
        String uid = "12345";

        BankClient bankClient1 = new BankClient("12344", "Bob Bobbins");
        BankClient bankClient2 = new BankClient("12346", "John Jonnins");

        List<BankClient> clients = new ArrayList<>();
        clients.add(bankClient1);
        clients.add(bankClient2);

        BankApiImpl bankApi = new BankApiImpl(clients);

        try{
            Optional <BankClient> foundedClient = bankApi.findByUid(userCredentials, uid);
            Optional <BankClient> expectedResult = Optional.empty();
            printResult("testCanSearchClientNoCorrespondingClientInList",
                    foundedClient.equals(expectedResult));
        }catch(AccessDeniedException exception){
            printResult("testCanSearchClientNoCorrespondingClientInList", false);
        }
    }

    void testCanSearchClientClientFoundedClientInList(){
        UserCredentials userCredentials = new UserCredentials(Role.CAN_SEARCH_CLIENTS);
        String uid = "12344";

        BankClient bankClient1 = new BankClient("12344", "Bob Bobbins");
        BankClient bankClient2 = new BankClient("12346", "John Jonnins");

        List<BankClient> clients = new ArrayList<>();
        clients.add(bankClient1);
        clients.add(bankClient2);

        BankApiImpl bankApi = new BankApiImpl(clients);

        try{
            Optional <BankClient> foundedClient = bankApi.findByUid(userCredentials, uid);
            Optional <BankClient> expectedResult = Optional.of(new BankClient("12344", "Bob Bobbins"));
            printResult("testCanSearchClientClientFoundedClientInList",
                    foundedClient.equals(expectedResult));
        }catch(AccessDeniedException exception){
            printResult("testCanSearchClientClientFoundedClientInList", false);
        }
    }

}
