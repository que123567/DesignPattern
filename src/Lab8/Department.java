package Lab8;

/**
 * Created by smaug on 2017/4/27.
 */
public class Department extends Observable
{

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Object object : observers) {
            ((Observer) object).update();
        }
    }
}
