package Exam_FileSystem_2;

/**
 * Created by Alex on 31/10/2015.
 */
public class VisitorSize
{
    // Directories
    public int size(Directory d) {
        int result = 0;
        for (AComponent child:d.getChildren())
            result = result + child.accept_size(this);
        return result;
    }

    // Files
    public int size(File f) {
        return 0;
    }
}
