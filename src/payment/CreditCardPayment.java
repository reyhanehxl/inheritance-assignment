package payment;

public class CreditCardPayment implements PaymentStrategy{
    String cardNumber;
    String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public String getPaymentDetails() {
        return "Credit card Payment\nCard number:  " + cardNumber +"\nCard holder name: "+cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "using Credit card.");
        System.out.println(getPaymentDetails());
    }
}
