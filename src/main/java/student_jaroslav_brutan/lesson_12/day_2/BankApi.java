package student_jaroslav_brutan.lesson_12.day_2;

import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
