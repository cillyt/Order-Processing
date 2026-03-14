package ua.university;

public class BankTransferPayment implements PaymentMethod{
    public void paid(Money amount){
        if(amount.getAmount()>0){
            amount.setAmount(amount.getAmount()-amount.getAmount()/100);
            System.out.println("Paid via bank: " + amount);
        }
        else{
            System.out.println("Declined"); ////own exception
        }
    }
}
