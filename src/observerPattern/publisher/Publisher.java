package observerPattern.publisher;

import observerPattern.State;
import observerPattern.observer.Observer;

public interface Publisher {

    public void addObserver(Observer observer);
    public boolean removeObserver(Observer observer);
    public void notifyObservers();
    public void changeState(State data);
}
