package ua.university;

public class Email {
    private String email;
    public Email(String email) {
        if(email.contains("@")){
            this.email = email;
        }
        else{
            System.out.println("Invalid Email");
        }
    }
}
