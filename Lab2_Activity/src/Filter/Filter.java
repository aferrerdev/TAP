package Filter;

/**
 * Created by Alex on 22/09/2015.
 */
public class Filter
{
    public static void filter(int list[], IFilter function)
    {
        int result [] = new int[list.length];
        for (int i = 0;i< list.length; i++)
        {
            result[i] = function.filter(list[i]);
            switch (result[i])
            {
                case 0:
                    System.out.println(list[i]+" es par.");
            }
        }
    }
}
