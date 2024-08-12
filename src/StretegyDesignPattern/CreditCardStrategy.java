package StretegyDesignPattern;

public class CreditCardStrategy implements PaymentStrategy{

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String cardNumber)
    {
        this.cardNumber =  cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Credit card.");
    }
}