package Exam_FileSystem_2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex on 31/10/2015.
 */
public class VisitorSearch
{
    // For Files
    public List<File> search(File f, String name) {
        List<File> result = new LinkedList<File>();
        if (f.getName().equals(name))
            result.add(f);
        return result;
    }

    // For directories
    public List<File> search(Directory d, String name) {
        List<File> result = new LinkedList<File>();
        for(AComponent component: d.getChildren())
        {
            result.addAll(component.accept_search(this,name));
        }
        //children.forEach(file -> result.addAll(file.search(name)));
        return result;
    }
}
