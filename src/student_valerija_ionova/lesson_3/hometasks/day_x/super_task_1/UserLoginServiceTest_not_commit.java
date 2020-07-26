/*package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserLoginServiceTest_not_commit {

    User user = new User("Antony", "12345");
    UserLoginService service = new UserLoginService();


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void login() {
        //Not right password

        boolean ifRightPassword = service.login(user, "123");
    assertEquals(false, ifRightPassword);
    assertEquals(2, user.timesToBlock);

    //toBlock user
        ifRightPassword = service.login(user, "12");
        ifRightPassword = service.login(user, "1");
        assertEquals(true, user.blocked);
    //right password

        user = new User("Antony", "12345");
        ifRightPassword = service.login(user, "12345");
        assertEquals(true, ifRightPassword);
        assertEquals(3, user.timesToBlock);

    }
}
*/