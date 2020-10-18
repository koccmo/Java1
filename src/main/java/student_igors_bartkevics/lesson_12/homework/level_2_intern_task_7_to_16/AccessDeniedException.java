/*
Для описания ошибки обозначающей, что у пользователя нет
прав вызывать метод findByUid() нужно создать свой класс ошибки:

class AccessDeniedException extends Exception {

}

И изменить сигнатуру метода findByUid() в интерфейсе следующим образом:

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials,
                                   String uid) throws AccessDeniedException;

}

Теперь из сигнатуры метода следует, что данный метод может
вернуть ("кинуть") ошибку типа AccessDeniedException.
 */
package student_igors_bartkevics.lesson_12.homework.level_2_intern_task_7_to_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AccessDeniedException extends Exception {
    AccessDeniedException(String message) {
        super(message);
    }

}
