package ua.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class OrderService {
    private final List<Order> database = new ArrayList<>();
    private final OrderProcessorTemplate processor; // Композиція

    public OrderService(OrderProcessorTemplate processor) {
        this.processor = processor;
    }

    public void createOrder(Order order) {
        database.add(order);
    }

    public Optional<Order> findById(String id) {
        return database.stream()
                .filter(o -> o.getId().equals(id))
                .findFirst();
    }

    public void executeOrder(String id, PaymentMethod method) {
        findById(id).ifPresent(order -> processor.process(order, method));
    }
}
