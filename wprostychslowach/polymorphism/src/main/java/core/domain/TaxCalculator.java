package core.domain;

import java.math.BigDecimal;

public interface TaxCalculator {
    BigDecimal calculate(BigDecimal salary);
}
