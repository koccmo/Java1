package student_volodya_danilin.lesson_12.level_2.Task_7;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }


    public Optional<BankClient> findByUid(UserCredentials credentials, String uid)
            throws AccessDeniedException {

        Optional<BankClient> result = Optional.empty();

        if (credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            for (BankClient value : clients) {
                if (value.getUid().equals(uid)) {
                    result = Optional.of(value);
                    break;
                }
            }
        }
        else {
            throw new AccessDeniedException("ACCESS DENIED");
        }

        return result;
    }
}
