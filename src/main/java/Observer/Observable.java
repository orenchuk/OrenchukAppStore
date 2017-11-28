package main.java.Observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers;

    public boolean addObserver(Observer obs) {
        return observers.add(obs);
    }

    public boolean removeObserver(Observer obs) {
        return observers.remove(obs);
    }

    public boolean notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
        return true;
    }

    public Observable() {
        observers = new ArrayList<>();
    }
}
