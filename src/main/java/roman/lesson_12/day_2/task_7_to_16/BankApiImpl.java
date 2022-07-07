package roman.lesson_12.day_2.task_7_to_16;

import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    private Optional<BankClient> findClientByUid (String uid) {
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (credentials.checkRoles(Role.CAN_SEARCH_CLIENTS)) {
            return findClientByUid(uid);
        } else {
            throw new AccessDeniedException("You do not access for this action!");
        }
    }
}
