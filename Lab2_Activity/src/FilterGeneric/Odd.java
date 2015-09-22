package FilterGeneric;

import Filter.*;

/**
 * Created by Alex on 22/09/2015.
 */
public class Odd implements IFIlter<Integer> {
    @Override
    public boolean apply(Integer elem) {
        return (elem%2==0);
    }
}
