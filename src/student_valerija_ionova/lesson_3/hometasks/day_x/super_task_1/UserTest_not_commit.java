package student_valerija_ionova.lesson_3.hometasks.day_x.super_task_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest_not_commit {

    private User user = new User("Bob", "bobby");
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getLogin() {
        assertEquals("Bob", user.getLogin());
    }

    @Test
    void getPassword() {
        assertEquals ("bobby", user.getPassword());
    }

    @Test
    void restartTimesToBlock() {
        user.timesToBlock--;
        user.restartTimesToBlock();
        assertEquals(3, user.timesToBlock);
    }

    @Test
    void toBlockUser() {
        user.toBlockUser();
        assertEquals(true, user.blocked);
    }
}