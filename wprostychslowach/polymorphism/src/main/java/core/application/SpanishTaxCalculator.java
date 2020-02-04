package core.application;

import core.domain.TaxCalculator;

import java.math.BigDecimal;

public class SpanishTaxCalculator implements TaxCalculator {
    public BigDecimal calculate(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.25"));
    }
}
