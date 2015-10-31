package Exam_FileSystem_2;

import java.util.Comparator;

/**
 * Created by Alex on 10/10/2015.
 */
public class AComponentComparator implements Comparator<AComponent> {

    public int compare(AComponent p1, AComponent p2) {
        String s1 = p1.getName();
        String s2 = p2.getName();
        return (s1.compareTo(s2));
    }
}

