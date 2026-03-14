package ua.university;

public class CardPayment implements PaymentMethod {

    public void paid(Money amount){
        if (amount.getAmount()>=20000 && amount.getAmount()>0) {
            System.err.println("Спроба оплати на суму " + amount.getAmount() + " перевищує ліміт картки.");
            throw new PaymentLimitException(amount.getAmount());
        }

        System.out.println("Успішно: " + amount);
    }
    }

