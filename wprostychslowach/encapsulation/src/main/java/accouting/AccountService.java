package accouting;

/* It's so simple and sexy */
public class AccountService {
    // here you would inject e.g. repository via constructor

    public void deactivate(int accountId) {
        Account account = new Account(); // here you would fetch someone's account from e.g. relational db
        account.deactivate(); // that's just it, nice!
        // accountRepository.save(account); here you would persist deactivated account entity
    }
}
