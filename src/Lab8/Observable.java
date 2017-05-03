package Lab8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smaug on 2017/4/27.
 */
abstract class Observable
{
    protected List<Observer> observers = new ArrayList<>();

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void notifyObserver();
}
