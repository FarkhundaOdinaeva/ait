package inheritance.auto.child;

import inheritance.auto.model.Auto;
public class Bus extends Auto {

    public void transportPassengers() {
        System.out.println("bus");
        printDetails();
    }
}