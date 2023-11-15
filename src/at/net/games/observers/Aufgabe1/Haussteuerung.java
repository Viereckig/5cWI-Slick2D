package at.net.games.observers.Aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class Haussteuerung {
    private List<TempObserver> tempObservers;
    private Termometer termometer;

    private void init(){
        tempObservers = new ArrayList<>();

        tempObservers.add(new Heizregler(20));
        tempObservers.add(new Heizregler(15));

        tempObservers.add(new Markiesenregler(false));
        tempObservers.add(new Markiesenregler(true));

        termometer = new Termometer();
    }

    public void main(String[] args) {
        init();
    }

    private void update(){
        float temp = termometer.getTemp();
        for (TempObserver tempObserver : tempObservers) {
            tempObserver.update(temp);
        }
    }
}
