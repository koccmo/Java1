package student_valerija_ionova.lesson_12.level_2_intern.refactoring_methods_not_more_than_3_strings;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class BankApiImplTest {

    BankApi bankApi = new BankApiImpl();
    UserCredentials userCredentials1 = new UserCredentials(Role.CAN_SEARCH_CLIENTS);
    UserCredentials userCredentials2 = new UserCredentials();

    BankClient bankClient1 = new BankClient("1", "John");
    BankClient bankClient2 = new BankClient("2", "Bob");
    BankClient bankClient3 = new BankClient("3", "Anna");
    BankClient bankClient4 = new BankClient("4", "Hanna");

    @Test
    public void testTryToFindClientIfAccessDenied(){
        boolean thrown = false;
        try {
            bankApi.findById(userCredentials2, "123");
        }catch (AccessDeniedException e){
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    public void testCanSearchAndUserExists(){
        BankApi bankApi = new BankApiImpl(bankClient1, bankClient2, bankClient3, bankClient4);
        Optional<BankClient> expectedResult = Optional.of(new BankClient("2", "Bob"));
        Optional <BankClient> result = Optional.empty();
        try {
            result = bankApi.findById(userCredentials1, "2");
        }catch (AccessDeniedException e){
        }
        assertEquals(expectedResult, result);
    }

    @Test
    public void testCanSearchAndUserDoesnTExists(){
        BankApi bankApi = new BankApiImpl(bankClient1, bankClient2, bankClient3, bankClient4);
        Optional<BankClient> expectedResult = Optional.empty();
        Optional <BankClient> result = Optional.empty();
        try {
            result = bankApi.findById(userCredentials1, "22");
        }catch (AccessDeniedException e){
        }
        assertEquals(expectedResult, result);
    }

}