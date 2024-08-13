package ObserverPattern;

public class SubscriberConcreate_Second implements Subscriber{

    @Override
    public void update(int val) {
        System.out.println("The publisher updated the [Subscriber2]: new value " + val);
    }
}
