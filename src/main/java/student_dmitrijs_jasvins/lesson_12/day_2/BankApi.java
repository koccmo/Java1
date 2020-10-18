package student_dmitrijs_jasvins.lesson_12.day_2;

import java.util.Optional;

public interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
