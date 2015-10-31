package Exam_FileSystem_2;

/**
 * Created by Alex on 31/10/2015.
 */
public class VisitorToString
{
    // Method for directories
    public String toString(Directory d) {
        String path="/";
        if (d.getParent()!=null)
            path = d.getParent().toString(this)+ "/";
        return path + d.getName();
    }

    // Method for files
    public String toString(File file) {
        String path = file.getParent().toString(this)+ "/";
        return path + file.getName();
    }
}
