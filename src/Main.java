import payment.*;

public class Main {
    public static void main(String[] args) {
        RegularCustomer cus1 = new RegularCustomer("Sara"), cus2 = new RegularCustomer("Dara");
        PremiumCustomer cus3 = new PremiumCustomer("Lara");

        System.out.println("Customer Information:");
        cus1.displayCustomerInfo();
        cus2.displayCustomerInfo();
        cus3.displayCustomerInfo();
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567899", "sara");
        PaymentStrategy paypalPayment = new PaypalPayment("sara@gmail.com");
        cus1.makePayment(paypalPayment, 10.50);
        cus1.makePayment(creditCardPayment, 109);

        PaymentStrategy bitcoinPayment2 = new BitcoinPayment("12wdfgj42dara");
        PaymentStrategy paypalPayment2 = new PaypalPayment("dara@gmail.com");
        cus2.makePayment(bitcoinPayment2, 709);
        cus2.makePayment(paypalPayment2, 70.9);

        PaymentStrategy creditCardPayment3 = new CreditCardPayment("9882349319", "lara");
        PaymentStrategy bitcoinPayment3 = new BitcoinPayment("7yhtgjkf2lara");
        cus3.makePayment(creditCardPayment, 40.30);
        cus3.makePayment(bitcoinPayment3, 600.23);

        System.out.println("\nPayment History of Sara(regular):\n");
        cus1.showPaymentHistory();
        System.out.println("\nPayment History of Dara(regular):\n");
        cus2.showPaymentHistory();
        System.out.println("\nPayment History of Lara(premium):\n");
        cus3.showPaymentHistory();
    }
}