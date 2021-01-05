package rouvt.services;

import rouvt.models.Observer;

public interface Observable {

    void addObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();

}
