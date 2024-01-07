public class RewardValue {
    private final double cashValue;
    private final int milesValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)convertToMiles();
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = (double)convertToCash(milesValue);
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public int getMilesValue() {
        return milesValue;
    }

    // Conversion method from cash to miles
    private int convertToMiles() {
        return (int) (cashValue * 0.0035);
    }

    // Conversion method from miles to cash
    private double convertToCash(int milesValue) {
        return milesValue / 0.0035;
    }
}