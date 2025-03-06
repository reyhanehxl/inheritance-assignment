import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer cus1 = new RegularCustomer("Sara"), cus2 = new RegularCustomer("Dara");
        PremiumCustomer cus3 = new PremiumCustomer("Lara");

        PaymentStrategy creditCardPayment = new CreditCardPayment("777", "terry");
        PaymentStrategy paypalPayment = new PaypalPayment("terry@gmail.com");
        PaymentStrategy bitcoinPayment = new BitcoinPayment("12wdfgj42");

        System.out.println("Customer Information:");
        cus1.displayCustomerInfo();
        cus2.displayCustomerInfo();
        cus3.displayCustomerInfo();

        cus1.makePayment(paypalPayment, 10.50);
        cus1.makePayment(creditCardPayment, 109);
        cus2.makePayment(bitcoinPayment, 709);
        cus2.makePayment(paypalPayment, 70.9);
        cus3.makePayment(creditCardPayment, 40.30);
        cus3.makePayment(bitcoinPayment, 600.23);

        System.out.println("\nPayment History of Sara(regular):\n");
        cus1.showPaymentHistory();
        System.out.println("\nPayment History of Dara(regular):\n");
        cus2.showPaymentHistory();
        System.out.println("\nPayment History of Lara(premium):\n");
        cus3.showPaymentHistory();
    }
}