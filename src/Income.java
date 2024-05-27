public class Income {
    private double husbandIncome;
    private double wifeIncome;

    public Income(float wifeIncome, float husbandIncome) {
        this.wifeIncome = wifeIncome;
        this.husbandIncome = husbandIncome;
    }

    public double getHusbandIncome() {
        return husbandIncome;
    }

    public double getWifeIncome() {
        return wifeIncome;
    }

}
