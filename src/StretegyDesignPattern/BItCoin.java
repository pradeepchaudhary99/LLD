package StretegyDesignPattern;

public class BItCoin implements PaymentStrategy {
    @java.lang.Override
    public void pay(int amount) {
        System.out.println(amount +" paid using BITCOIN");
    }
}
