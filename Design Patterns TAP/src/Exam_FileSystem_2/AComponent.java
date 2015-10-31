package Exam_FileSystem_2;

import java.util.List;

/**
 * Created by Alex on 06/10/2015.
 * Aquesta és la interface de la implementarem les classes File i Directory.
 */
public interface AComponent {

    // get Component Name.
    public String getName();

    // size(): It returns the  total size  of all files  contained in this directory (include subdirectories).
    public int accept_size(VisitorSize visitor);

    // If we perform ls() over one directory, it will print the name of all files and directories that it contains.
    public void accept_ls(Visitorls visitor, VisitorToString vToString);

     // collect(): It returns a list of String that contains all names of files and directories that are contained in this directory (include subdirectories).
    public List<String> accept_collect(VisitorCollect visitor, VisitorToString vToString);

    // toList(): It returns one list of all components (can be files or directories) that are contained in this directory (include subdirectories).
    public List<AComponent> accept_toList(VisitorToList visitor);

    // search(name): It returns a list of files whose name coincides with name in all sub tree of this directory.
    public List<File> accept_search(VisitorSearch visitor, String name);

    public String toString(VisitorToString visitor);

    public void setParent(AComponent parent);

}
