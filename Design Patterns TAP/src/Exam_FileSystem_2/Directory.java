package Exam_FileSystem_2;

import java.util.*;

/**
 * Created by Alex on 06/10/2015.
 */
public class Directory implements AComponent {
    private String name;
    private List<AComponent> children;
    private AComponent parent = null;


    public Directory(String name) {
        this.name = name;
        children = new LinkedList<AComponent>();
    }
    public void addChild(AComponent child) throws FileExistsException{
        List<File> files = search(child.getName());
        if(files.size() == 0){
            child.setParent(this); // Set child parent
            children.add(child);
        }
        else
            throw new FileExistsException();

    }
    public void removeChild(AComponent child){
        children.remove(child);
    }
    @Override
    public String toString() {
        String path="/";
        if (parent!=null)
            path = parent.toString()+ "/";
        return path + name;
    }

    @Override
    public String getName() {
        return this.name;
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
    public List<File> search(String name) {
        List<File> result = new LinkedList<File>();
        for(AComponent component: children)
        {
            result.addAll(component.search(name));
        }
        //children.forEach(file -> result.addAll(file.search(name)));
        return result;
    }

    @Override
    public void setParent(AComponent parent) {
        this.parent = parent;
    }

    // collect(): It returns a list of String that contains all names of files and directories that are contained in this directory (include subdirectories).
    @Override
    public List<String> collect() {
        List<String> result = new LinkedList<String>();
        result.add(toString());
        for (AComponent child:children)
            result.addAll(child.collect());
        return result;
    }
    @Override
    public void ls() {
        children.forEach((file -> file.ls()));
        /* for (AComponent child:children)
            child.ls();*/
    }
    @Override
    public List<AComponent> toList() {
        List<AComponent> result = new LinkedList<AComponent>();
        result.add(this);
        for (AComponent child:children)
            result.addAll(child.toList());
        return result;
    }
}
