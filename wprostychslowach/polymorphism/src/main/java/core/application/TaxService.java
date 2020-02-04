package core.application;

import common.StorageException;
import common.TaxCalculatorException;
import core.domain.Client;
import core.domain.ClientDataRetrieval;
import core.domain.TaxCalculator;

import java.math.BigDecimal;

public class TaxService {
    private final ClientDataRetrieval clientDataRetrieval;
    private final TaxCalculator taxCalculator;

    public TaxService(ClientDataRetrieval clientDataRetrieval, TaxCalculator taxCalculator) {
        this.clientDataRetrieval = clientDataRetrieval;
        this.taxCalculator = taxCalculator;
    }

    public void process(String clientName) {
        try {
            Client client = clientDataRetrieval.findBy(clientName);
            BigDecimal tax = taxCalculator.calculate(client.getSalary());
            System.out.format("Client %s must pay %s%n", clientName, tax);
        } catch (StorageException sex) {
            System.out.println("Storage exception");
        } catch (TaxCalculatorException tex) {
            System.out.println("No strategy found");
        } catch (Exception ex) {
            // log
        }
    }
}
