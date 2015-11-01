package ObserverList;

import java.util.Vector;

/**
 * Created by Alex on 01/11/2015.
 *  3. Implement BackupObserver  to keep a copy of each added element and this function and remove then when was indicated.
 */
public class BackupObserver<T> implements Observer<T>
{
    private Vector<T> backup;

    public BackupObserver()
    {
        backup = new Vector<T>();
    }

    // Implements Observer method
    public void notifyAdd(T elem)
    {
        backup.add(elem);
    }

    public void notifyRemove(T elem)
    {
        backup.remove(elem);
    }

    // Needed for comparing names inserting Observers.
    public boolean equals(Object obj) {
        return this.getClass().getCanonicalName().equals(obj.getClass().getCanonicalName());
    }

    public String toString() {
        return this.getClass().getName();
    }
}
