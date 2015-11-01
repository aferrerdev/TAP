package ObserverList;

/**
 * Created by Alex on 01/11/2015.
 * 1. Implement PrinterObserver to show by standard output the element and the completed operation (add or remove).
 */
public class PrinterObserver<T> implements Observer<T>
{
    @Override
    public void notifyAdd(T element)
    {
        System.out.println("ADDED: "+element);
    }

    @Override
    public void notifyRemove(T element)
    {
        System.out.println("REMOVED: "+element);
    }

    // Needed for comparing names inserting Observers.
    public boolean equals(Object obj) {
        return this.getClass().getCanonicalName().equals(obj.getClass().getCanonicalName());
    }

    public String toString() {
        return this.getClass().getName();
    }
}
