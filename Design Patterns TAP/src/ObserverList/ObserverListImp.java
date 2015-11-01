package ObserverList;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Alex on 01/11/2015.
 */
public class ObserverListImp<T> implements ObserverList<T>
{
    Vector<Observer<T>> observers;
    Vector<T> content;

    public ObserverListImp()
    {
        observers = new Vector<Observer<T>>();
        content = new Vector<T>();
    }

    // ================================================================================================================
    // ObserverList Implementation:
    @Override
    public void add(T elem)
    {
        content.add(elem);
        notifyAllAdd(elem);
    }

    @Override
    public void remove(T elem)
    {
        content.remove(elem);
        notifyAllRemove(elem);
    }

    @Override
    public void register(Observer<T> observer) throws RepeatedObserverException
    {
        if (observers.contains(observer))
            throw new RepeatedObserverException("Observer '"+observer+"' already exists!");
        observers.add(observer);
    }

    @Override
    public void unregister(Observer<T> observer) {
        observers.remove(observer);
    }

    @Override
    public Iterator<T> iterator() {
        return content.iterator();
    }

    // ================================================================================================================
    // Observers notifys:
    protected void notifyAllAdd(T elem) {
        for (Observer<T> ob:observers)
            ob.notifyAdd(elem);
    }

    protected void notifyAllRemove(T elem) {
        for (Observer<T> ob:observers)
            ob.notifyRemove(elem);
    }
}
