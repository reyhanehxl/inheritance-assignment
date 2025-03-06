package payment;

public class BitcoinPayment implements PaymentStrategy{
    String walletAddress;
    public BitcoinPayment(String walletAddress){
        this.walletAddress = walletAddress;
    }

    @Override
    public String getPaymentDetails() {
        return "Bitcoin Payment\nWallet Address:  " + walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "using Bitcoin.");
        System.out.println(getPaymentDetails());
    }
}
