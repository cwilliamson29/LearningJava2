public class TaxCalculator2019 implements TaxCalculator {
    private Income taxableIncome;
    private double taxRate = .19;

    public TaxCalculator2019(Income taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax() {
        double grossIncome = taxableIncome.getWifeIncome() + taxableIncome.getHusbandIncome();
        return grossIncome * taxRate;
    }

    public double calculateNetIncome() {
        double grossIncome = taxableIncome.getWifeIncome() + taxableIncome.getHusbandIncome();
        double tax = grossIncome * taxRate;
        return grossIncome - tax;
    }

    public double getTaxableIncome() {
        return taxableIncome.getWifeIncome() + taxableIncome.getHusbandIncome();
    }

    public double getTaxRate() {
        return taxRate;
    }
}
