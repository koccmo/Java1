package student_igors_bartkevics.lesson_12.homework.level_2_intern;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws Exception;

}
