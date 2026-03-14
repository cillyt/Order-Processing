package ua.university;

public class OrderItem {
    private final String product;
    private final Money price;
    public OrderItem(String product, Money price) {
        this.product = product;
        this.price = price;
    }
    public Money getPrice() {
        return price;
    }
}
