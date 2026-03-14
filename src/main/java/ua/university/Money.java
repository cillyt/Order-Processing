package ua.university;

public class Money {
    private final double amount;
    private final String currency;
    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
