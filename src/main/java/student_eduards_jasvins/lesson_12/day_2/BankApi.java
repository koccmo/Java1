package student_eduards_jasvins.lesson_12.day_2;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;


}
