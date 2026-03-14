package ua.university;

public class Main {
    public static void main(String[] args) {

        OrderService service = new OrderService(new OrderProcessor());

        OrderItem[] items = {
                new OrderItem("Ноутбук", new Money(30000, "UAH")),
                new OrderItem("Миша", new Money(500, "USD"))
        };

        Order order = new Order("001", items);
        service.createOrder(order);

        service.executeOrder("001", new CardPayment());

        System.out.println("Чи знайшли замовлення? " + service.findById("001").isPresent());


    }
}