/*
Task_12:
Создайте класс BankApiImpl так, что бы он реализовывал интерфейс BankApi:

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        // если в credentials нет роли Role.CAN_SEARCH_CLIENTS
        // то метод должен кидать ошибку AccessDeniedException
        // иначе производить поиск клиента с указанным uid
    }

}

Реализуйте класс BankApiImpl и метод findByUid().
 */
package student_igors_bartkevics.lesson_12.homework.level_2_intern_task_7_to_16;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {

        // если в credentials нет роли Role.CAN_SEARCH_CLIENTS
        // то метод должен кидать ошибку AccessDeniedException
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException("You've got no rights to search clients");
        }
        // иначе производить поиск клиента с указанным uid
        return findBankClientByUid(uid);
    }

    private Optional<BankClient> findBankClientByUid(String uid) {
        Optional<BankClient> optBankClient = Optional.empty();
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                optBankClient = Optional.of(client);
                break;
            }
        }
        return optBankClient;
    }

}
