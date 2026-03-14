package ua.university;

public class PayPalPayment implements PaymentMethod{
    public void paid(Money amount){
        if(amount.getAmount()>100){
            System.out.println("Paid by PayPal: " + amount);
        }
        else{
            System.out.println("Declined"); ////own exception
        }
    }
}
