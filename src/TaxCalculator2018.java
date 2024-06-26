public class TaxCalculator2018 implements TaxCalculator {
    private Income taxableIncome;
    private double taxRate = .14;

    public TaxCalculator2018(Income taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public double calculateTax() {
        double grossIncome = taxableIncome.getWifeIncome() + taxableIncome.getHusbandIncome();
        return grossIncome * taxRate;
    }

    @Override
    public double calculateNetIncome() {
        double grossIncome = taxableIncome.getWifeIncome() + taxableIncome.getHusbandIncome();
        double tax = grossIncome * taxRate;
        return grossIncome - tax;
    }

    @Override
    public double getTaxableIncome() {
        return taxableIncome.getWifeIncome() + taxableIncome.getHusbandIncome();
    }

    @Override
    public double getTaxRate() {
        return taxRate;
    }
}
