import java.text.NumberFormat;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        var net = calculator.calculateNetIncome();
        System.out.println("Gross Income: " + NumberFormat.getCurrencyInstance().format(calculator.getTaxableIncome()));
        System.out.println("Tax Rate: " + String.format("%.0f", calculator.getTaxRate() * 100) + "%");
        System.out.println("Tax Paid: " + NumberFormat.getCurrencyInstance().format(tax));
        System.out.println("-------------------");
        System.out.println("Net Income: " + NumberFormat.getCurrencyInstance().format(net));
    }

}
