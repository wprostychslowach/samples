package ugly.accounting;

import java.time.LocalDateTime;

/*  No encapsulation

    Think that you deactivate account in more than one place. Think.. if deactivation business rules change you'll have to introduce
    them in every piece of code that uses account's deactivation.
 */
public class AccountService {
    // here you would inject e.g. repository via constructor

    public void deactivate(int accountId) {
        Account account = new Account(); // fetch someone's account from e.g. relational db via injected repository

        // you have to know deactivation's business rules and remember all of them! Our example is very very trivial.
        if(account.getState().equals(State.Inactive)) {
            throw new RuntimeException("Cannot deactivate inactive account");
        }

        account.setState(State.Inactive);
        // what if you forget about setting deactivation date... uh. :<
        account.setDeactivationDate(LocalDateTime.now());

        // accountRepository.save(account); here you would persist deactivated account entity
    }
}
