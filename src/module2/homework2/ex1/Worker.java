package module2.homework2.ex1;

import java.util.Queue;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwBag(Queue<Baggage> baggages) {
        Baggage baggage = baggages.poll();
        if (baggage != null) {
            System.out.println(name + ": Мужики, кидаю чемодан " + baggage.getFlightNumber());
        }
    }
}
