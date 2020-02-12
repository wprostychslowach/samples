import java.math.BigDecimal;

class ExternalBankApi {
    BigDecimal transfer(BigDecimal transferAmount, BigDecimal balance, String fromAccountNumber, final String toAccountNumber) {
        // transfer processing

        return balance.subtract(transferAmount);
    }
}
