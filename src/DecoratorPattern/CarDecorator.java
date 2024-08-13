package DecoratorPattern;



//Decorator has both
// 1. IS-A relationship and HAS-A relationship with Car[Component interface]
public class CarDecorator implements Car{

    protected Car car;
    public CarDecorator(Car c)
    {
        this.car = c;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
}
