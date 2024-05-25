//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // var textBox = new TextBox();

//        var point1 = new Point(1, 2);
//        var point2 = new Point(1,2);
//        System.out.println(point1 == point2);
//        System.out.println(point1.equals(point2));
        var calculator = new TaxCalculator2018(100000);
        var report = new TaxReport(calculator);
    }
}