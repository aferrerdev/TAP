package Exam_FileSystem;

import java.util.List;

/**
 * Created by Alex on 06/10/2015.
 * Aquesta és la interface de la implementarem les classes File i Directory.
 */
public interface AComponent {

    // get Component Name.
    public String getName();

    // size(): It returns the  total size  of all files  contained in this directory (include subdirectories).
    public int size();

    // If we perform ls() over one directory, it will print the name of all files and directories that it contains.
    public void ls();

     // collect(): It returns a list of String that contains all names of files and directories that are contained in this directory (include subdirectories).
    public List<String> collect();

    // toList(): It returns one list of all components (can be files or directories) that are contained in this directory (include subdirectories).
    public List<AComponent> toList();

    // search(name): It returns a list of files whose name coincides with name in all sub tree of this directory.
    public List<File> search(String name);

    public void setParent(AComponent parent);

}
