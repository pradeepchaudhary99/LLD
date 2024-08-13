package ObserverPattern;

public class SubscriberConcreate_First implements Subscriber{
    @Override
    public void update(int val) {
        System.out.println("The publisher updated the [Subscriber1]: new value " + val);
    }
}
