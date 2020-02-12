package dbc;

import java.math.BigDecimal;

public class TransferServiceProvider implements TransferContract {
    private ExternalBankApi externalBankApi = new ExternalBankApi();

    @Override
    public void transfer(BigDecimal transferAmount, BigDecimal balance, String fromAccountNumber, final String toAccountNumber) {

        // To simplify, I assumed that client sent me correct input, so I don't do any validation.

        // Call bank API and return new customer's account balance
        BigDecimal newBalance = externalBankApi.transfer(transferAmount, balance, fromAccountNumber, toAccountNumber);

        // post-condition: new balance == (old balance - transfer amount)
        assert newBalance.compareTo(balance.subtract(transferAmount)) == 0 : "smth went wrong";
    }
}