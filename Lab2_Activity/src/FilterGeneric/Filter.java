package FilterGeneric;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex on 22/09/2015.
 */
public class Filter {
    public static <T> List<T> filter(List<T> list, IFIlter<T> function){
        List<T> result = new LinkedList<T>();
        for (T elem:list)
            if(function.apply(elem))
                result.add(elem);
        return result;
    }
}
