//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var income = new Income(35000, 75000);
        var calculator = new TaxCalculator2018(income);
        var report = new TaxReport(calculator);

        report.show();
    }
}