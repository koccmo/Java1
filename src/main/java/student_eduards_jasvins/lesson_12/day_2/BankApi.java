package student_eduards_jasvins.lesson_12.day_2;

import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;


}
