package student_valerija_ionova.lesson_12.level_2_intern.task_7_16;

/*Task10
В интерфейсе мы сможем чётко обозначить
какую функциональность мы предоставляем (названия методов),
какие входные параметры мы принимаем и что отдаём в качестве результата.
Создайте интерфейс BankApi:


Метод findByUid() должен возвращать ("кидать") ошибку
если в переданных credentials нет роли Role.CAN_SEARCH_CLIENTS.

*/

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
