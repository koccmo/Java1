package student_volodya_danilin.lesson_12.level_2.Task_7;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws AccessDeniedException;

}
