package core.domain;

import java.math.BigDecimal;

public class Client {
    private final BigDecimal salary;

    public Client(final BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
