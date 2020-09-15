package student_valerija_ionova.lesson_12.level_2_intern.task_7_16;

//Task12

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi{

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (credentials.containsRole(Role.CAN_SEARCH_CLIENTS)){
            return findClientInList(uid);
        }else{
            throw new AccessDeniedException();
        }

        // если в credentials нет роли Role.CAN_SEARCH_CLIENTS
        // то метод должен кидать ошибку AccessDeniedException
        // иначе производить поиск клиента с указанным uid
    }

    private Optional<BankClient> findClientInList(String uid){
        for (BankClient client : clients){
            if (client.getUid().equals(uid)){
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
