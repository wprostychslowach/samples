package dbc;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        TransferServiceProvider transferServiceProvider = new TransferServiceProvider();

        BigDecimal balance = new BigDecimal(150);
        BigDecimal transferAmount = new BigDecimal(100);
        String fromAccountNumber = "12345678901234567890122456";

        // it's final so invariant "toAccountNumber == old(toAccountNumber)" is always true beacause of being final
        final String toAccountNumber = "12345678901234567890123456";

        // pre-conditions
        assert balance.compareTo(transferAmount) >= 0 : "balance < transfer amount";
        assert fromAccountNumber.length() == 26 : "wrong fromAcc length";
        assert toAccountNumber.length() == 26 : "wrong  toAcc length";

        // input data ok - let's pass to transfer function
        transferServiceProvider.transfer(transferAmount, balance, fromAccountNumber, toAccountNumber);
    }
}
