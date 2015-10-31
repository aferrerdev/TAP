package Exam_FileSystem_2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alex on 06/10/2015.
 */
public class File implements AComponent {
    private String name;
    private int size;
    private AComponent parent = null;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public AComponent getParent() {
        return parent;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setParent(AComponent parent) {
        this.parent = parent;
    }

    // =================================================================================================================
    // Implemented methods
    public void accept_ls(Visitorls visitor, VisitorToString vToString) {
        visitor.ls(this,vToString);
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
