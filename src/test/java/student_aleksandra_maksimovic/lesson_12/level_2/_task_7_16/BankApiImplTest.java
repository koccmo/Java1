package student_aleksandra_maksimovic.lesson_12.level_2._task_7_16;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BankApiImplTest {

    BankApi api;

    @Before
    public void init() {
        List<BankClient> clients = new ArrayList<>();
        api = new BankApiImpl(clients);
    }


    @Test(expected = AccessDeniedException.class)
    public void accessDeniedTest() throws AccessDeniedException {
        api.findByUid(new UserCredentials(new ArrayList<>()), "123");
    }

}