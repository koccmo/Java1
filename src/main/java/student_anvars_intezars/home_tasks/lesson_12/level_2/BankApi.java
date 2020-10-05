package student_anvars_intezars.home_tasks.lesson_12.level_2;

import java.util.Optional;

interface BankApi {

    Optional<BankClient>findByUid(UserCredentials credentials,
              String uid) throws AccessDeniedException;
}
