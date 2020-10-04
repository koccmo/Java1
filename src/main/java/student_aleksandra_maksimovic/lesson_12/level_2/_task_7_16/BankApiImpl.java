package student_aleksandra_maksimovic.lesson_12.level_2._task_7_16;

import java.util.List;
import java.util.Optional;

/*
Создайте класс BankApiImpl так, что бы он реализовывал интерфейс BankApi:
Реализуйте класс BankApiImpl и метод findByUid().
 */
class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }


    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (credentials.isRole(Role.CAN_SEARCH_CLIENTS)) {
           return findClientInList(uid);
        }
        else {
            throw new AccessDeniedException("no rights to search clients");
        }


    }

    private Optional<BankClient> findClientInList(String uid) {
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }

        return Optional.empty();
    }

}
