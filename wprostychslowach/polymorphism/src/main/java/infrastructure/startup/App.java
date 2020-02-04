package infrastructure.startup;

import core.application.PolishTaxCalculator;
import core.application.RadomTaxCalculator;
import core.application.SpanishTaxCalculator;
import core.application.TaxService;
import infrastructure.repositories.FileClientDataRetrieval;
import infrastructure.repositories.SQLClientDataRetrieval;

class App {
    private static TaxService spanishTaxService = new TaxService(new SQLClientDataRetrieval(), new SpanishTaxCalculator());
    private static TaxService polishTaxService = new TaxService(new SQLClientDataRetrieval(), new PolishTaxCalculator());
    private static TaxService radomishTaxService = new TaxService(new FileClientDataRetrieval(), new RadomTaxCalculator());

    public static void main(String[] args) {
        String[] spanishClients = new String[]{"Alberto Raro", "Juan de Campo"};
        for (String clientName : spanishClients) {
            spanishTaxService.process(clientName);
        }

        System.out.println();

        String[] polishClients = new String[]{"Piotr Marzec", "Ola Gola"};
        for (String clientName : polishClients) {
            polishTaxService.process(clientName);
        }

        System.out.println();

        String[] radomishClients = new String[]{"Marek Nowak", "Maciej Kowalski"};
        for (String clientName : radomishClients) {
            radomishTaxService.process(clientName);
        }
    }
}
