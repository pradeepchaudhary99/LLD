package DecoratorPattern;

public class Test {
    public static void main(String[] args) {

        Car sportCar = new SportsCar(new BasicCar());
        sportCar.assemble();
        System.out.println("\n*******");

        Car sportLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();
    }
}
