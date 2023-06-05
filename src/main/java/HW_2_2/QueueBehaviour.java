package HW_2_2;

import HW_2_1.Actor;

public interface QueueBehaviour {

    void acceptToMarket(Actor actor);

    void takeInQueue(Actor actor);

    void takeOrders();

    void giveOrders();

    void releaseFromQueue();

}