package ua.university;

import java.util.Arrays;
import java.util.Objects;

public class Order {
    private final String id;
    private final OrderItem[] items;
    private boolean isPaid = false;
    private Email email;
    public Order(String id, OrderItem[] items, boolean isPaid, Email email) {
        this.id = id;
        this.items = items != null ? Arrays.copyOf(items, items.length): new OrderItem[0];  // defensive copy
        this.isPaid = isPaid;
        this.email = email;
    }
    public Order(String id, OrderItem[] items) {
        this(id,items,false,null);

    }

    public String getId() {
        return id;
    }
    public void setIsPaid(boolean paid) {
        isPaid = paid;
    }

    public OrderItem[] getItems() {
        return Arrays.copyOf(items, items.length);    //defensive copy
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}
