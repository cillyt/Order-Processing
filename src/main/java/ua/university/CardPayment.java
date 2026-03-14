package ua.university;

public class CardPayment implements PaymentMethod {

    public void paid(Money amount){
        if(amount.getAmount()<=20000 && amount.getAmount()>0){
            System.out.println("Paid by card: " + amount);
        }
        else{
            System.out.println("Declined"); //// exception own!!!
        }
    }
}
