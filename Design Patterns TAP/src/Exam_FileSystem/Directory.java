package Exam_FileSystem;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Alex on 06/10/2015.
 */
public class Directory implements AComponent {
    private String name;
    private List<AComponent> children;


    public Directory(String name) {
        this.name = name;
        children = new LinkedList<AComponent>();
    }
    public void addChild(AComponent child) {
        children.add(child);

    }
    public void removeChild(AComponent child){
        children.remove(child);
    }
    @Override
    public String toString() {
        return "/"+this.name;
    }

    // Implemented methods
    @Override
    public int size() {
        int result = 0;
        for (AComponent child:children)
            result = result + child.size();
        return result;
    }
    @Override
    public List<File> search() {
        return null;
    }
    // collect(): It returns a list of String that contains all names of files and directories that are contained in this directory (include subdirectories).
    @Override
    public List<String> collect() {
        return null;
    }
    @Override
    public void ls() {
        children.forEach((file -> file.ls()));
        /*
        for (AComponent child:children)
            child.ls();*/
    }
    @Override
    public List<AComponent> toList() {
        return null;
    }
}
