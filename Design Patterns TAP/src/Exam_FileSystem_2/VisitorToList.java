package Exam_FileSystem_2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex on 31/10/2015.
 */
public class VisitorToList
{
    // Method for Files.
    public List<AComponent> toList(File file)
    {
        List<AComponent> result = new LinkedList<AComponent>();
        result.add(file);
        return result;
    }

    // Method for directories
    public List<AComponent> toList(Directory directory) {
        VisitorToList vToList = this;
        List<AComponent> result = new LinkedList<AComponent>();
        result.add(directory);
        for (AComponent child:directory.getChildren())
            result.addAll(child.accept_toList(vToList));
        return result;
    }
}
