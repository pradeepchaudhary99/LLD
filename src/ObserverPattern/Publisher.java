package ObserverPattern;

import java.util.List;

public interface Publisher {

    void addSubscriber(Subscriber obj);
    void removeSubscriber(Subscriber obj);

    void notifyChange(int val);

}
