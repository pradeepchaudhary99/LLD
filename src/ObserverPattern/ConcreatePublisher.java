package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreatePublisher implements Publisher{
    List<Subscriber> subscribers;
    int val;
    public ConcreatePublisher()
    {
        subscribers = new ArrayList<>();
        val = 0;
    }

    @Override
    public void addSubscriber(Subscriber obj) {
        subscribers.add(obj);
    }

    @Override
    public void removeSubscriber(Subscriber obj) {
        subscribers.remove(obj);
    }

    @Override
    public void notifyChange(int val) {

        if(this.val == val)
            return;
        this.val = val;
        //notify all the subscribers [sub1, sub2, ------]
        for (Subscriber sub : subscribers)
        {
            sub.update(val);
        }
    }
}
