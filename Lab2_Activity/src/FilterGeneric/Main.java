package FilterGeneric;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex on 22/09/2015.
 */
public class Main
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result  = Filter.filter(list,new Odd());
        for (Integer elem:result)
            System.out.println(elem);
    }
}