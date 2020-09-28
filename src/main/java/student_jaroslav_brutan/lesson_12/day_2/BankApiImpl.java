package student_jaroslav_brutan.lesson_12.day_2;

import java.util.List;
import java.util.Optional;

public class BankApiImpl {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException{
        if (credentials.hasRole(Role.CAN_SEARCH_CLIENTS)){
            return findClientInTheList(uid);
        } else {
            throw new AccessDeniedException();
        }
    }

    private Optional<BankClient> findClientInTheList(String uid){
        for (BankClient client : clients){
            if (client.getUid().equals(uid)){
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
