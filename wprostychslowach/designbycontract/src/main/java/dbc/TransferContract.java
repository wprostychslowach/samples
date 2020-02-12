package dbc;

import java.math.BigDecimal;

/*
    Invariants:
                     toAccountNumber == old(toAccountNumber) (toAccountNumber cannot be changed even if method throws exception)

    Pre conditions:  transferAmount > 0 &&
                     fromAccountNumber is not empty && fromAccountNumber.length == 26 &&
                     toAccountNumber is not empty && toAccountNumber.length == 26 &&
                     balance>=transferAmount

    Post conditions:  new balance == (old balance - transfer amount)

*/
interface TransferContract {
    void transfer(BigDecimal transferAmount, BigDecimal balance, String fromAccountNumber, final String toAccountNumber);
}
