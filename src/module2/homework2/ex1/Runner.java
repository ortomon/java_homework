package module2.homework2.ex1;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Worker[] workers = {new Worker("1"), new Worker("2"), new Worker("3")};
        BaggageCompartment baggageCompartment = new BaggageCompartment(List.of(workers));
        baggageCompartment.arrivalPlane("SU-077");
        baggageCompartment.arrivalPlane("AO-222");
        baggageCompartment.unload();
    }
}
