package student_valerija_ionova.lesson_12.level_2_intern.refactoring_methods_not_more_than_3_strings;

import java.util.Optional;

interface BankApi {

    Optional <BankClient> findById (UserCredentials userCredentials, String uid) throws AccessDeniedException;

}
