package student_valerija_ionova.lesson_12.level_2_intern.refactoring_methods_not_more_than_3_strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi{

    private List<BankClient> clients;

    BankApiImpl (BankClient...clients){
        this.clients = new ArrayList<>(Arrays.asList(clients));
    }

    @Override
    public Optional<BankClient> findById(UserCredentials userCredentials, String uid) throws AccessDeniedException {
        if (userCanSearchClients(userCredentials)){
            return wantedClient(uid);
        }else{
            throw new AccessDeniedException();
        }
    }

    private boolean userCanSearchClients (UserCredentials userCredentials){
        return userCredentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS);
    }

    private Optional <BankClient> wantedClient (String uid){
        return clients.stream()
                .filter(bankClient -> uidMatch(bankClient, uid))
                .findAny();
    }

    private boolean uidMatch (BankClient bankClient, String uid){
        return bankClient.getUid().equals(uid);
    }

}
