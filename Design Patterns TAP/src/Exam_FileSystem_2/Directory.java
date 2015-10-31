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

    public List<AComponent> getChildren(){
        return children;
    }

    public void addChild(VisitorSearch visitor, AComponent child) throws FileExistsException{
        List<File> files = accept_search(visitor, child.getName());
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
    public String getName() {
        return this.name;
    }
    @Override
    public void setParent(AComponent parent) {
        this.parent = parent;
    }

    public AComponent getParent()
    {
        return parent;
    }
    // =================================================================================================================
    // Implemented methods
    public void accept_ls(Visitorls visitor, VisitorToString vToString) {
        visitor.ls(this, vToString);
    }

    @Override
    public List<String> accept_collect(VisitorCollect visitor, VisitorToString vToString) {
        return visitor.collect(this,vToString);
    }

    @Override
    public int accept_size(VisitorSize visitor) {
        return visitor.size(this);
    }

    @Override
    public List<AComponent> accept_toList(VisitorToList visitor) {
        return visitor.toList(this);
    }

    @Override
    public List<File> accept_search(VisitorSearch visitor, String name) {
        return visitor.search(this,name);
    }

    @Override
    public String toString(VisitorToString visitor) {
        return visitor.toString(this);
    }
}
