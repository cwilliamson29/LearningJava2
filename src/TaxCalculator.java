public interface TaxCalculator {
    double calculateTax();

    double calculateNetIncome();

    double getTaxableIncome();

    double getTaxRate();
}
