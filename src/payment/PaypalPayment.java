package payment;

public class PaypalPayment implements PaymentStrategy{
    String email;
    public PaypalPayment(String email){
        this.email = email;
    }
    @Override
    public String getPaymentDetails() {
        return "Paypal Payment\nEmail:  " + email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "using Paypal.");
        System.out.println(getPaymentDetails());
    }

}
