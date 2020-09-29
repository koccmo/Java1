package student_eduards_jasvins.lesson_12.day_2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,
                                          String uid) throws AccessDeniedException {
        if (credentials.containsRole(Role.CAN_SEARCH_CLIENTS)) {
            return findByUid(uid);
        } else {
            throw new AccessDeniedException();
        }
    }

    private Optional <BankClient> findByUid(String uid) {
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
