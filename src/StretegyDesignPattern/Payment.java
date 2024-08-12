package StretegyDesignPattern;

public class Payment {

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    //payment has-a payment strategy
    private PaymentStrategy paymentStrategy;

    //constructor injection -->
    public Payment(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(int amount)
    {
        this.paymentStrategy.pay(amount);
    }

}
