package payment;

import java.util.Scanner;

public class RegularCustomer extends Customer{
    public RegularCustomer(String name){
        super(name);
    }

    @Override
    public void displayCustomerInfo() {
        System.out.println("Regular Customer:" + name);
    }
}
