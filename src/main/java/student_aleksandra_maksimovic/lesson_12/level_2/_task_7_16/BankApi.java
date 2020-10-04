package student_aleksandra_maksimovic.lesson_12.level_2._task_7_16;



import java.util.Optional;

/*
Время пришло создавать интерфейс для нашего API.
Почему мы начинаем реализацию задачи именно с интерфейса?
Потому что интерфейс позволит нам чётко очертить границы
нашего будушего решения. В интерфейсе мы сможем чётко обозначить
какую функциональность мы предоставляем (названия методов),
какие входные параметры мы принимаем и что отдаём в качестве результата.

Создайте интерфейс BankApi:

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid);

}

Метод findByUid() должен возвращать ("кидать") ошибку
если в переданных credentials нет роли Role.CAN_SEARCH_CLIENTS.

Внесите необходимые изменения в интерфейс BankApi,
что бы реализовать требование описанное выше.
 */
public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
