package ua.university;

public class BankTransferPayment implements PaymentMethod{
    public void paid(Money amount){
        if(amount.getAmount()>0){
            System.out.println("Сплачено банком: " + (amount.setAmount(amount.getAmount()* 0.99 * 3/100) + " " + amount.getCurrency()));
        }
        else{
            System.out.println("Відхилено");
        }
    }
}
