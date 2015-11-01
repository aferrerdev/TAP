package ObserverList;

/**
 * Created by Alex on 01/11/2015.
 * Observer Contract
 * Interf�cie del Observer amb els m�todes notify per a Add i Remove.
 */
public interface Observer<T>
{
    void notifyAdd(T element);
    void notifyRemove(T element);
}
