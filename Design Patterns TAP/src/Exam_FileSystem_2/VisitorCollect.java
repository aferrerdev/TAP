package Exam_FileSystem_2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex on 31/10/2015.
 * collect(): It returns a list of String that contains all names of files and directories that are contained in this directory (include subdirectories).
 */
public class VisitorCollect
{
    // Method for directory
    public List<String> collect(Directory directory, VisitorToString vToString) {
        List<String> result = new LinkedList<String>();
        result.add(directory.toString(vToString));
        for (AComponent child:directory.getChildren())
            result.addAll(child.accept_collect(this,vToString));
        return result;
    }

    // Method for Files
    public List<String> collect(File file, VisitorToString vToString) {
        List<String> result = new LinkedList<String>();
        result.add(file.toString(vToString));
        return result;
    }

}
