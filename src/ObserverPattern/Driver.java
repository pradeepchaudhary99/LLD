package ObserverPattern;

public class Driver {
    public static void main(String[] args) {

        SubscriberConcreate_First first = new SubscriberConcreate_First();
        SubscriberConcreate_Second Second = new SubscriberConcreate_Second();

        ConcreatePublisher publisher = new ConcreatePublisher();
        publisher.addSubscriber(first);
        publisher.addSubscriber(Second);

        publisher.notifyChange(100);
        publisher.notifyChange(120);

        publisher.removeSubscriber(first);

        publisher.notifyChange(200);
    }
}
