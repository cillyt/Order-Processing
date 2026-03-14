package ua.university;

public class PayPalPayment implements PaymentMethod{
    public void paid(Money amount){
        if(amount.getAmount()>100){
            System.out.println("Сплачено PayPal: " + amount + " " + amount.getCurrency());
        }
        else{
            System.out.println("Відхилено");
        }
    }
}
