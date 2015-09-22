package Filter;

/**
 * Created by Alex on 22/09/2015.
 */
import static java.lang.Math.*;

public class FilterNum implements IFilter {
    @Override
    public int filter(int number) {
        return floorMod(number,2);
    }
}
