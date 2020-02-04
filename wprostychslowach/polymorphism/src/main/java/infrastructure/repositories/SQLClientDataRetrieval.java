package infrastructure.repositories;


import core.domain.Client;
import core.domain.ClientDataRetrieval;

import java.math.BigDecimal;

public class SQLClientDataRetrieval implements ClientDataRetrieval {
    public Client findBy(String name) {
        if ("John Doe".equals(name)) {
            return new Client(new BigDecimal("3000.00"));
        }
        return new Client(new BigDecimal("3500.00"));
    }
}
