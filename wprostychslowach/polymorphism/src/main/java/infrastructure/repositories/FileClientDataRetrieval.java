package infrastructure.repositories;

import core.domain.Client;
import core.domain.ClientDataRetrieval;

import java.math.BigDecimal;

public class FileClientDataRetrieval implements ClientDataRetrieval {
    public Client findBy(String name) {
        return new Client(new BigDecimal("9999.00"));
    }
}
