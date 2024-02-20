package DesignPatterns.BehaviouralDesignPatterns.TemplatePattern;

public class Client {
    public static void main(String[] args) {
        PaymentFlow payment = new PayToFriend();
        payment.sendMoney();

        System.out.println();

        payment = new PayToMerchant();
        payment.sendMoney();
    }
}
