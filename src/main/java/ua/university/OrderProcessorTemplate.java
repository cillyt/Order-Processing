package ua.university;

abstract class OrderProcessorTemplate {
    public final void process(Order order, PaymentMethod paymentMethod) {
        if (validate(order)) {
            Money total = calculateTotal(order);
            paymentMethod.paid(total);
            order.setIsPaid(true);
            notifyUser(order);
        }
    }

    protected boolean validate(Order order) {
        System.out.println("Валідація замовлення " + order.getId());
        return order.getItems().length > 0;
    }

    protected abstract Money calculateTotal(Order order);
    protected abstract void notifyUser(Order order);
}

class OrderProcessor extends OrderProcessorTemplate {
    @Override
    protected Money calculateTotal(Order order) {
        double sum = 0;
        for (OrderItem item : order.getItems()) {
            sum += item.getPrice().getAmount();
        }

        return new Money(sum, "UAH");
    }

    @Override
    protected void notifyUser(Order order) {
        System.out.println("Email відправлено: замовлення " + order.getId() + " успішне.");
    }
}
