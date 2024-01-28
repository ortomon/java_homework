package module2.homework2.ex1;

import java.util.*;

public class BaggageCompartment {
    private List<String> arrivalOrder = new LinkedList<>(); // Порядок прилета рейсов
    private Map<String, Queue<Baggage>> baggagesByFlight = new HashMap<>();
    private List<Worker> workers = new LinkedList<>();

    public BaggageCompartment(List<Worker> workers) {
        this.workers.addAll(workers);
    }

    public void arrivalPlane(String flightNumber) {
        arrivalOrder.add(flightNumber);
        Queue<Baggage> baggages = new LinkedList<>();

        for (int i = 0; i < 20; i++) {
            Baggage baggage = new Baggage(flightNumber);
            baggages.add(baggage);
        }

        baggagesByFlight.put(flightNumber, baggages);
    }

    public void unload() {
        for (String flightNumber : arrivalOrder) {
            Queue<Baggage> baggages = baggagesByFlight.get(flightNumber);

            while (!baggages.isEmpty()) {
                for (Worker worker : workers) {
                    worker.throwBag(baggages);
                }
            }
        }

        arrivalOrder.clear();
    }
}
