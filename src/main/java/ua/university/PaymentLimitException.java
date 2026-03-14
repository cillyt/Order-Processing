package ua.university;

public class PaymentLimitException extends RuntimeException {
    public PaymentLimitException(double amount) {
        super("Платіж відхилено: сума " + amount + " не відповідає лімітам (0-20000).");
    }
}
