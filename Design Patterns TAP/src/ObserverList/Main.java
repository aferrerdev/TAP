package ObserverList;

/**
 * Created by Alex on 01/11/2015.
 * 3. ObserverList
 * The problem is to create an ObserverList collection that implements the observer design pattern.
 * It will notify of  changes to the observers (notifyAdd and notifyRemove methods)
 * when the state of ObserverList is modified (add or remove elements).
 * The collection must be Iterable and generic.
 */
public class Main
{
    public static void main(String[] args)
    {
        testStrings();
        testIntegers();
    }
    public static void testStrings()
    {
        // Create List of items to observe with PrintObserver ans BackupObserver.
        ObserverListImp<String> strings = new ObserverListImp<String>();

        try
        {
            // Register Observers to observer list in ObserverListImp object.
            strings.register(new PrinterObserver<String>());
            strings.register(new BackupObserver<String>());
        }
        catch (RepeatedObserverException e)
        {
            System.out.println("Existent Observer Exception....");
            System.out.println("   '---> " + e.getMessage());
        }
        // Creating content with Objects
        for (String s:new String[]{"hola", "adios", "hello", "goodbye"})
            strings.add(s);

        // List real content.
        System.out.println("List content:");
        for (String s:strings)
            System.out.println(s);
        System.out.println();

        try
        {
            strings.register(new BackupObserver<String>());
        }
        catch (RepeatedObserverException e)
        {
            System.out.println("CExistent Observer...");
            System.out.println("   '---> " + e.getMessage());
        }
    }

    public static void testIntegers()
    {
        ObserverListImp<Integer> integers = new ObserverListImp<Integer>();

        try
        {
            integers.register(new PrinterObserver<Integer>());
            integers.register(new BackupObserver<Integer>());
        }
        catch (RepeatedObserverException e)
        {
            System.out.println("Existent Observer.");
            System.out.println("   '---> " + e.getMessage());
        }

        for (Integer s:new Integer[]{ 4, 6, 3, 5, 4 })
            integers.add(s);

        System.out.println("List content:");
        for (Integer s:integers)
            System.out.println(s);
        System.out.println();
    }
}